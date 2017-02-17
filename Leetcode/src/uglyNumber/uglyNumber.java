package uglyNumber;

public class uglyNumber {
     public static boolean uglyNumber(float n){
    	 float num_2 = 0;
    	 float num_3 = 0;
    	 float num_5 = 0;
    	 while(n!=0){
    		 num_2 = n/2;
    		 if((int)num_2 == num_2){
    			 System.out.println("num_2" + " " + num_2+" "+(int)num_2);
    			 n = (int)num_2;
    			 continue;
    		 }
    		 num_3 = n/3;
    		 if((int)num_3 == num_3){
    			 n = (int)num_3;
    			 System.out.println("num_3" + " " +  num_3+" "+(int)num_3);
    			 continue;
    		 }
    		 num_5 = n/5;
    		 if((int)num_5 == num_5){
    			 n = (int)num_5;
    			 System.out.println("num_5" + " " +  num_5+" "+(int)num_5);
    			 continue;
    		 }
    		 else break;
    	 }
    	 if(n==1)return true;
    	 else return false;
     }
     
     public static boolean uglyNumber_2(int n){
    	 int num_2 = 0;
    	 int num_3 = 0;
    	 int num_5 = 0;
    	 int count = 0;
    	 while(n!=0){
    		 num_2 = n%2;
    		 if(num_2 == 0){
    			 count++;
    			 System.out.println(count + ": " + "n/2 = " + n/2);
    			 n = n/2;    			 
    			 continue;
    		 }
    		 num_3 = n%3;
    		 if(num_3 == 0){
    			 count++;
    			 System.out.println(count + ": " + "n/3 = " + n/3);
    			 n = n/3;
    			 continue;
    		 }
    		 num_5 = n%5;
    		 if(num_5 == 0){
    			 count++;
    			 System.out.println(count + ": " + "n/5 = " + n/5);
    			 n = n/5;
    			 continue;
    		 }
    		 else break;
    	 }
    	 if(n==1)return true;
    	 else return false;
     }
     
     public static boolean uglyNumber_3(int n){
    	 int count = 0;
    	 if(n==0) return false;
    	 if(n==1) return true;
    	 /**
    	  * 循环除以2 3 5，看是否可以被2 3 5整除，是否含有2 3 5因子；
    	  */
    	 while(n%2==0)n/=2;
    	 while(n%3==0)n/=3;
    	 while(n%5==0)n/=5;
    	 if(n==1)return true;
    	 else return false;
     }
     
     public static void main(String args[]){
    	 int n = 14;
    	 boolean result = uglyNumber_3(n);
    	 System.out.println(result);
     }
}
