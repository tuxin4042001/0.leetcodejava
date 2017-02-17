package addDigits;

import java.util.Scanner;

public class addDigits_2 {
	public int addDigits_2(int num){
		if(num<10){
			return num;
		}
		else if(num%9==0){
			return 9;
		}
		else{
			return num%9;
		}
	}
    
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("pls enter a value: ");
		int num = in.nextInt();
		addDigits_2 test = new addDigits_2();
		int i = test.addDigits_2(num);
		System.out.println(i);
	}
}
