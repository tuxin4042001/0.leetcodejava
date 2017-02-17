
package addDigits;

import java.util.Scanner;

public class addDigits_1 {
	static String str, str1;
	public int addDigits_1(int num){
		if(num<=9){
			return num;
		}
		else{
			str = Integer.toString(num);
			int j = 0;
			for(int i=0;i<str.length();i++){
				//利用str.substring将字符串按个存取;
				//注意字符串到整形，整形到字符串的转化;
				char c = str.charAt(i);
				j += Character.getNumericValue(c);
				System.out.print("+"+Character.getNumericValue(c));	
			}
			System.out.println("="+j);
			//利用自身的函数调用实现后面的do...while语句,实现迭代;
			return addDigits_1(j);
		
		}
	}
    
	public static void main(String args[]){
		addDigits test = new addDigits();	
		Scanner in = new Scanner(System.in);
		System.out.println("pls enter a value: ");
		int k = in.nextInt();
		/**
		do{
            k = test.addDigits(k);
		}while(k>9);
		**/
		k = test.addDigits(k);
		//int k = test.addDigits(99);
		System.out.println(k);
	}
}
