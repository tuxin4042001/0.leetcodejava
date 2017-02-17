package _62_uniquePath;

import java.util.function.IntPredicate;

public class uniquePaths2 {
	//解法一，动态规划解法，九宫格解法，result[0][j] = 1 result[i][0] = 1，result[i][j] = result[i - 1][j] + result[i][j - 1];
    public int uniquePaths(int m, int n) {
        int[][] result = new int[m][n];
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(i == 0 || j == 0){
        			result[i][j] = 1;
        		}else{
        			result[i][j] = result[i - 1][j] + result[i][j - 1];
        		}       		
        	}
        }
        return result[m - 1][n - 1];
    }
    
    //解法二：迭代的算法，类似九宫格算法，uniquePath2(m, n) = uniquePaths2(m - 1, n) + uniquePaths2(m, n - 1);
    //     但是这种解法耗时太长，会超出时间限制
    public int uniquePaths2(int m, int n) {
        if(m < 1 || n < 1)
        	return 0;
        if(m == 1 || n == 1)
        	return 1;
        return uniquePaths2(m - 1, n) + uniquePaths2(m, n - 1);
    }
    
    //解法三：数学方法，实际就是求组合的问题，从左上角到右下角一共需要m + n - 2步，其中横向移动的n - 1步是任意取位置的，即求C(m + n - 2, n - 1)
    public int uniquePaths3(int m, int n) {
        if(m < 1 || n < 1)
        	return 0;
        if(m == 1 || n == 1)
        	return 1;
        int N = n - 1;
        int M = m + n - 2;
        return combination(N, M);
    }
    
    public int combination(int N, int M){
    	double res = 1;
    	for(int i = 1; i <= N; i++){
    		res = res*(M - N + i)/i;
    	}
    	return (int)res;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
