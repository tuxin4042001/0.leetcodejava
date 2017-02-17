package _73_setMatrixZeros;

public class setZeroes {
	//��⣺����Ĺؼ������matrix��matrix[i][j] = 0�Ļ�����Ӧ�к��ж���Ҫ��Ϊ0��
	//����1�����ǲ���һ��ʼ�ͽ���Ӧ��������Ϊ0������û��������ȥ���ᵼ�����е�matrixԪ�ض�Ϊ0����������Ҫ�½�row[matrix.length]��col[matrix[0].length]����¼
	//     ��¼��һ��һ��Ӧ����Ϊ0
	//�Ż�����������½�row[matrix.length]��col[matrix[0].length]�Ļ������ǻ�ռ�ö���Ŀռ䣬���Կ�������matrix[0][j]��matrix[i][0]����������,����
	//    matrix[0][j]�Ƿ���Ϊ0��matrix[i][0]�Ƿ���Ϊ0�����ö���ı�����¼��
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
        	for(int j = 0; j < matrix[0].length; j++){
        		if(matrix[i][j] == 0){
        			row[i] = true;
        			col[j] = true;
        		}
        	}
        }
        
        for(int i = 0; i < matrix.length; i++){
        	for(int j = 0; j < matrix[0].length; j++){
        		if(row[i]){
        			matrix[i][j] = 0;
        		}
        		
        		if(col[j]){
        			matrix[i][j] = 0;
        		}
        	}
        }
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
