
package addDigits;

import java.util.Scanner;

public class addDigits {
	static String str, str1;
	public int addDigits(int num){
		if(num<=9){
			return num;
		}
		else{
			str = Integer.toString(num);
			int j = 0;
			for(int i=0;i<str.length();i++){
				//����str.substring���ַ���������ȡ;
				//ע���ַ��������Σ����ε��ַ�����ת��;
				str1 = str.substring(i,i+1);
				j += Integer.parseInt(str1);
				System.out.print("+"+str1);	
			}
			System.out.println("="+j);
			//��������ĺ�������ʵ�ֺ����do...while���,ʵ�ֵ���;
			return addDigits(j);
		
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
