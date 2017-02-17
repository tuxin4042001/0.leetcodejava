package _172_FactorialTrailingZeros;

public class trailingZeroes {
    public int trailingZeroes(int n) {
        if(n==0){
        	return 0;
        }else{
        	return n/5 + trailingZeroes(n/5);
        }
    }
	
	public static double factorial(double n){
		double result = 1;
		for(double i = n; i > 0; i--){
			result = result * i;
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(factorial(10));
		System.out.println(factorial(11));
		System.out.println(factorial(12));
		System.out.println(factorial(13));
		System.out.println(factorial(14));
		System.out.println(factorial(15));
		System.out.println(factorial(16));
		System.out.println(factorial(17));
		System.out.println(factorial(18));
		System.out.println(factorial(19));
		System.out.println(factorial(25));
		int[] nums = {1,2};
	} 

}
