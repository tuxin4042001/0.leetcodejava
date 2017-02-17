package _79_wordSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exist {
//    public boolean exist(char[][] board, String word) {
//    	List<Character> tempList = new ArrayList<Character>();
//        for(int i = 0; i < board.length - 1; i++){
//        	tempList = Arrays.asList(board[i]);
//        }
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'a', 'b', 'c'};
		List<Character> tempList = new ArrayList<Character>();
		tempList = Arrays.asList('a','b','c');
		for(char i : tempList){
			System.out.println(i);
		}

	}

}
