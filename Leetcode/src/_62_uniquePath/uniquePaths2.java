package _62_uniquePath;

import java.util.function.IntPredicate;

public class uniquePaths2 {
	//�ⷨһ����̬�滮�ⷨ���Ź���ⷨ��result[0][j] = 1 result[i][0] = 1��result[i][j] = result[i - 1][j] + result[i][j - 1];
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
    
    //�ⷨ�����������㷨�����ƾŹ����㷨��uniquePath2(m, n) = uniquePaths2(m - 1, n) + uniquePaths2(m, n - 1);
    //     �������ֽⷨ��ʱ̫�����ᳬ��ʱ������
    public int uniquePaths2(int m, int n) {
        if(m < 1 || n < 1)
        	return 0;
        if(m == 1 || n == 1)
        	return 1;
        return uniquePaths2(m - 1, n) + uniquePaths2(m, n - 1);
    }
    
    //�ⷨ������ѧ������ʵ�ʾ�������ϵ����⣬�����Ͻǵ����½�һ����Ҫm + n - 2�������к����ƶ���n - 1��������ȡλ�õģ�����C(m + n - 2, n - 1)
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
		// TODO �Զ����ɵķ������

	}

}