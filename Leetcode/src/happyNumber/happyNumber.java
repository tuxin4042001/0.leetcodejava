package happyNumber;
import java.lang.Math;
import java.util.HashMap;


public class happyNumber {
public static boolean happyNumber(int n){
	if(n==1)return true;
	
	
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	int sum = 0;
	int key = 1;
	
	do{
		sum = 0;
		/**
		 * 第一种计算平方和的方法，转化为字符串计算；
		 */
	    String str = Integer.toString(n);
		for(int i=0;i<str.length();i++){
			sum += (int)Math.pow(Character.getNumericValue(str.charAt(i)),2);		
	    }
		/**
		 * 另外一种计算平方和的方法，
		 * while(n>0){
		 * sum += (n%10)*(n%10);
		 * n = n/10;
		 * }
		 * 
		 */
        if(map.containsValue(sum)){
        	return false;
        }
        else{
        	map.put(key,sum);
        	key++;
        	n = sum;
        }
	}while(n!=1);
           
    return true;    
		
	}

    public static void main(String args[]){
    	int n = 2;
    	boolean result = happyNumber(n);
    	System.out.println(result);
    }
	
}

