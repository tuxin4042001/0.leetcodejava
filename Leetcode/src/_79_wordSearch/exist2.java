package _79_wordSearch;

public class exist2 {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for(int i = 0; i < row; i++){
        	for(int j = 0; j < col; j++){
        		if(find(board, i, j, visited, word, 0)) return true;
        	}
        }
        return false;
    }
    
    public boolean find(char[][] board, int rowIndex, int colIndex, boolean[][] visited, String word, int wordIndex){
    	if(wordIndex == word.length()) return true;
    	if(rowIndex < 0 || rowIndex == board.length || colIndex < 0 || colIndex == board[0].length ) return false;
    	if(board[rowIndex][colIndex] != word.charAt(wordIndex)) return false;
    	if(visited[rowIndex][colIndex]) return false;
        visited[rowIndex][colIndex] = true;
    	if(find(board, rowIndex - 1, colIndex, visited, word, wordIndex + 1)) return true;
    	if(find(board, rowIndex + 1, colIndex, visited, word, wordIndex + 1)) return true;
    	if(find(board, rowIndex, colIndex - 1, visited, word, wordIndex + 1)) return true;
        if(find(board, rowIndex, colIndex + 1, visited, word, wordIndex + 1)) return true;
    	visited[rowIndex][colIndex] = false;
    	return false;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
