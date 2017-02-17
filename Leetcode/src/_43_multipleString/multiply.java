package _43_multipleString;

public class multiply {
	public String multiply(String num1, String num2) {
    	int m = num1.length();
    	int n = num2.length();
    	int[] pos = new int[m + n];
    	for(int i = m - 1; i >= 0; i--){
    		for(int j = n - 1; j >= 0; j--){
    			int multiply = (num1.charAt(i) - '0')*(num2.charAt(j) - '0');
    			//注意设置p1 p2目的何在，两位multiply相乘，可以得到数组p1 p2的值，逐位更新，得到整个int[] pos
    			int p1 = i + j, p2 = i + j + 1;
    			int sum = multiply + pos[p2];
    			pos[p1] = sum / 10;
    			pos[p2] = sum % 10;
    		}
    	}
    	
    	StringBuilder str = new StringBuilder();
    	for(int p : pos){
    		//意思为第一个0不添加
    		if(!(str.length() == 0 && p == 0)){
    			str.append(p);
    		}
    	}
    	return str.length() == 0 ? "0" : str.toString();
        
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// 测试char和int相互转换
		char c1 = '9';
		char c2 = '8';
		int i = c1 - '0';
		int j = c2 - '0';
		int k = i * j;
		System.out.println(k);
		String str = Integer.toString(k);
		System.out.println(str);
	}

}
