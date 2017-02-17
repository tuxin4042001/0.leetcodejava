package _62_uniquePath;

public class uniquePaths {
	//method 1: recursion method, however, it will too long to get the result, time limit extended
    public static int uniquePaths(int m, int n) {
        if(m < 1 || n < 1) return 0;
        if(m == 1 || n == 1) return 1;
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }
    
    //method 2: 九宫格算法，关键在于知道result[i][j] = result[i - 1][j] + result[i][j - 1]
    public int uniquePaths2(int m, int n) {
        int[][] result = new int[m][n];
        for(int i = 0; i < n; i++){
        	result[0][i] = 1;
        }
        
        for(int i = 0; i < m; i++){
        	result[i][0] = 1;
        }
        
        for(int i = 1; i < m; i++){
        	for(int j = 1; j < n; j++){
        		result[i][j] = result[i - 1][j] + result[i][j - 1];
        	}
        }
        
        return result[m - 1][n - 1];
    }
    
    //method3: N = m + n - 2到达终点的最终步数是确定的， K = m - 1到达重点需要下移的步数也是确定的，所以可以简化为组合问题，n + m - 2中选择 m - 1步问题
    public int uniquePaths3(int m, int n) {
        if(m < 1 || n < 1) return 0;
        if(m == 1 || n == 1) return 1;
        int N = m + n - 2;
        int K = m - 1;
        return combination(N, K);
    }
    
    public static int combination(int N, int K){
    	double res = 1;
    	for(int i = 1; i <= K; i++){
    		res = res*(N - K + i)/i;
    	}
    	return (int)res;
    }
    
    public int permutation(int N, int K){
    	double res = 1;
    	for(int i = 1; i <= K; i++ ){
    		res = res*(N - K + i);
    	}
    	return (int)res;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int m = 23;
		int n = 12;
		System.out.println(uniquePaths(m, n));

		int N = 33;
		int K = 22;
		System.out.println(combination(N, K));
	}

}
