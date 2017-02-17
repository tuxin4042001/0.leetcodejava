package _67_addBinary;

//方法一：将string的binary相加转化为整数的binary相加，a和b的每个字符如何转化为整数a.charAt(a_index)-'0',b.charAt(b_index)-'0'
public class addBinary {
    public String addBinary(String a, String b) {
    	int a_index = a.length()-1;
    	int b_index = b.length()-1;
    	int sum = 0;
    	int carry = 0;
    	StringBuilder str = new StringBuilder("");
    	while(a_index >= 0 || b_index >= 0){
    		sum = carry;
    		if(a_index >= 0) sum = sum + (a.charAt(a_index--) - '0');
    		if(b_index >= 0) sum = sum + (b.charAt(b_index--) - '0');
    		carry = sum / 2;
    		sum = sum % 2;
    		str.append(sum);
    	}
    	if(carry != 0) str.append(carry);
    	return str.reverse().toString();
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
