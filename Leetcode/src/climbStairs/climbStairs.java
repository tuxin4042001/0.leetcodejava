package climbStairs;

public class climbStairs {
	public static int climbStairs(int n){
		int method = 0;
		if(n==0)return method = 0;
		if(n==1)return method = 1;
		if(n==2)return method = 2;
		/**
		 * ʹ�õ����ķ������ҵ�n>2ʱ����������n-1��n-2�Ĺ�ϵ��
		 * ע������Ҫ��climbStairs(n-1)+climbStairs(n-2)��������climbStairs(n-1)+2*climbStairs(n-2)
		 * ��Ϊ�����ظ����������1,(1,1)��1,1,(1)
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
		 * ע�⵱n>2ʱ��������ʽ��Ϊ쳲��������̣�����ֱ��д����ʽ�㷨��
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
