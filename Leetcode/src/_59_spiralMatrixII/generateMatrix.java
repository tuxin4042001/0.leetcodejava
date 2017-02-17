package _59_spiralMatrixII;

public class generateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        if(n == 0){
        	return result;
        }
        int num = 1;
        int rowBegin = 0, rowEnd = n - 1;
        int colBegin = 0, colEnd = n - 1;
        while(rowBegin <= rowEnd && colBegin <= colEnd && num <= n*n){
        	for(int i = colBegin; i <= colEnd; i++){
        		result[rowBegin][i] = num++;
        	}
        	rowBegin++;
        	
        	for(int j = rowBegin; j <= rowEnd; j++){
        		result[j][colEnd] = num++;
        	}
        	colEnd--;
        	
        	if(rowBegin <= rowEnd){
        		for(int k = colEnd; k >= colBegin; k--){
        			result[rowEnd][k] = num++;
        		}
        	}
        	rowEnd--;
        	
        	if(colBegin <= colEnd){
        		for(int l = rowEnd; l >= rowBegin; l--){
        			result[l][colBegin] = num++;
        		}
        	}
        	colBegin++;
        }
        
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] result = new int[0][0];
		for(int[] p : result){
			for(int q : p){
				System.out.print(q);
			}
		}
	}

}
