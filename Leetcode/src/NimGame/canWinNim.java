package NimGame;

import java.util.*;

public class canWinNim {

	static Scanner in = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);
	static canWinNim result = null;
	static boolean res;
    static String str;
    public boolean canWinNim(int n) {
        if(n%4 == 0){
            return false;
        }
        else{
            return true;
        }
        
    }
    
    public static void main(String args[]) throws Exception{
    	do{
    	System.out.println("pls enter the number of stones: "); 	
    	int number = in.nextInt();
    	canWinNim result = new canWinNim();
    	boolean res = result.canWinNim(number);
    	System.out.println("If I can win the Nim Game? the answer is: "+res);
    	System.out.println("Do you want to continue? Y or N");
    	str = input.next();
    	}while(str.equals("Y"));
    }
}