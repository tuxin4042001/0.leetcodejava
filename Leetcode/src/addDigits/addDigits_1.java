
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
				//����str.substring���ַ���������ȡ;
				//ע���ַ��������Σ����ε��ַ�����ת��;
				char c = str.charAt(i);
				j += Character.getNumericValue(c);
				System.out.print("+"+Character.getNumericValue(c));	
			}
			System.out.println("="+j);
			//��������ĺ�������ʵ�ֺ����do...while���,ʵ�ֵ���;
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
