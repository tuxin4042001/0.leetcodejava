package _79_wordSearch;

import java.util.ArrayList;
import java.util.List;

public class exist {
    public boolean exist(char[][] board, String word) {
    	//issue1: board.length and board[0].length can be used as 2nd dimension for the visited arrays and loop
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
        	for(int j = 0; j < board[0].length; j++){
        		if(findChar(board, visited, i, j, word, 0))return true;
        	}
        }
        return false;
    }
    
    public boolean findChar(char[][] board, boolean[][] visited, int i, int j, String word, int index){
    	if(index == word.length()) return true;
    	//if i and j out of bound of board, result should be false
    	if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) return false;
    	//if visited[i][j] has been visited before, then false
    	if(visited[i][j]) return false;
    	//if board[i][j] is not equal to word.charAt(index), then false
    	if(board[i][j] != word.charAt(index)) return false;
    	
    	//at first, assume that board[i][j] is a good path that can be used
    	visited[i][j] = true;
    	if(findChar(board, visited, i, j+1, word, index+1)) return true; 
    	if(findChar(board, visited, i, j-1, word, index+1)) return true;
        if(findChar(board, visited, i+1, j, word, index+1)) return true;
        if(findChar(board, visited, i-1, j, word, index+1)) return true;
        //however, if you cannot find the next character of "word" in the adjcent element, then board[i][j] should be a
        //bad path
        visited[i][j] = false;
        
        return false;
    	
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char[] ch = {'a','b','c'};
		System.out.println(ch[0]);
		ch[0] ^= 256;
		ch[0] ^= 256;
		System.out.println(ch[0]);

	}

}
