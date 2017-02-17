package climbStairs;

public class climbStairs {
	public static int climbStairs(int n){
		int method = 0;
		if(n==0)return method = 0;
		if(n==1)return method = 1;
		if(n==2)return method = 2;
		/**
		 * 使用迭代的方法，找到n>2时攀爬方法和n-1与n-2的关系；
		 * 注意这里要用climbStairs(n-1)+climbStairs(n-2)而不能用climbStairs(n-1)+2*climbStairs(n-2)
		 * 因为会有重复的情况，如1,(1,1)及1,1,(1)
		 */
		if(n>=2){
			method = climbStairs(n-1)+climbStairs(n-2);
		}
		return method;
	}
	
	public static int climbStairs_2(int n){
		int[] record = new int [n];
		if(n==0|n==1|n==2)return n;
		/**
		 * 注意当n>2时，攀爬方式成为斐波那契方程，可以直接写错方程式算法；
		 */
		else{
			record[0]=1;
			record[1]=2;
			for(int i=2;i<n;i++){
				record[i]=record[i-1]+record[i-2];
			}
			return record[n-1];
		}
	}
    
	public static void main(String args[]){
		int result = climbStairs(4);
		int result_2 = climbStairs_2(4);
		System.out.println(result);
	}
}
