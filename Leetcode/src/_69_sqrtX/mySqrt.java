package _69_sqrtX;

public class mySqrt {
    public int mySqrt(int x) {
    	if(x < 0) return -1;
    	if(x == 0) return 0;
    	//为什么右边界取x/2 + 1, 而不是x? 如果画出x/2 + 1的曲线图和 sqrt(x)的曲线图，就会发现x/2 + 1永远大于sqrt(x)，所以取x/2 + 1为右边界没问题
    	int left = 1, right = x/2 + 1;
    	while(true){
    		int m = (left + right)/2;
    		if(m > x/m){
    			right = m - 1;
    		}else{
    			if((m + 1) > x/(m + 1)){
    				return m;
    			}
    			left = m + 1;
    		}
    	}      
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double i = 2147395599;
		int j = (int)Math.sqrt(i);
		double k = i/2 + 1;
		System.out.println(j);
		System.out.println(k);
		System.out.println(Integer.MAX_VALUE);

	}

}
