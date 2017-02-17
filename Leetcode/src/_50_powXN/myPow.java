package _50_powXN;

public class MyPow {
    public double myPow(double x, int n) {
    	//当出现极值的情况下，结果返回0
        if(n == Integer.MIN_VALUE && x > 1)
            return 0;
        if(n == 0) 
        	return 1;
        //当指数n < 0的时候，想办法转化为n > 0的情况
        if(n < 0){
        	n = -n;
        	x = 1/x;
        }
        //使用迭代的方法求myPow(x,n),注意这里使用 myPow(x*x,n/2)而不使用 myPow(x,n/2)*myPow(x,n/2),原理都是一样的，但是前者块很多不用两次迭代
        return (n % 2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2); 
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
