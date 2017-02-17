package _8_stringToIntegerAToI;


//解法： 关键是要针对几种不同的情况分别处理：
//     a. str == null, return 0
//     b. str == "   123", ignore the space, index should begin with '1'
//     c. str == "+123", define a int sign, if str.charAt(index) == '+', sign == 1, otherwise sign == -1
//     d. sum out of Integer bound, sum > Integer.MAX_VALUE/10 || sum == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10
//        return Integer.MAX_VALUE or Integer.MIN_VALUE
public class myAtoi2 {
	public int myAtoi(String str) {
		int index = 0, sum = 0, sign = 1;
		if(str.length() == 0){
			return 0;
		}
		
		while(str.charAt(index) == ' ' && index < str.length())
			index++;
		
		if(str.charAt(index) == '+' || str.charAt(index) == '-'){
			sign = (str.charAt(index) == '+') ? 1 : -1;
			index++;
		}
			
		while(index < str.length()){
			int digit = str.charAt(index) - '0';
			if(digit < 0 || digit > 9){
				break;
			}
			if(sum > Integer.MAX_VALUE/10 || sum == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10){
				return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			sum = sum * 10 + digit;
			index++;
		}
		
		return (sign == 1) ? sum : -sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		int Char = '1';
		count = Char - '0';
		System.out.println(count);

	}

}
