package _29_divideTwoInteger;

import _5_longestPalindromicSubstring.longestPalindrome;

public class divide {
    public static int divide(int dividend, int divisor) {
    	//define sign
    	int sign = 1;
    	if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)){
    		sign = -1;
    	}

    	//define long data
    	//issue1: long ldividend = Math.abs(dividend) = Math.abs(-2147483648) = -2147483648, so need (long)
    	long ldividend = Math.abs((long)dividend);
    	long ldivisor = Math.abs((long)divisor);

    	if(ldivisor == 0) return Integer.MAX_VALUE;
    	if(ldividend == 0) return 0;
    	long lans = ldivide(ldividend, ldivisor);


    	
    	int ans = 0;
    	//issue2: long lans = ldivide(-2147483648, -1) = -2147483648
    	if(Math.abs(lans) > Integer.MAX_VALUE){
    		ans = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    	}else{
    		ans = (int) (sign * lans);
    	}
        return ans;
    }
    
    public static int ldivide(long ldividend, long ldivisor){
    	if(ldividend < ldivisor){
    		return 0;
    	}
    	
    	//use double sum method to calculate the value of ldividend
    	long sum = ldivisor;
    	int multiple = 1;
    	while((sum+sum) < ldividend){
    		sum += sum;
    		multiple += multiple;

    	}
    	return multiple + ldivide(ldividend - sum, ldivisor);
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int dividend = -2147483648;
		int divisor = -1;

	}

}
