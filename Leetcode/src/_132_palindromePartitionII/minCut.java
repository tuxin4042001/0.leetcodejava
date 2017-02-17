package _132_palindromePartitionII;

import java.util.ArrayList;
import java.util.List;

public class minCut {
    public int minCut(String s) {
        List<String> list = new ArrayList<String>();
        if(s == null || s.length() == 0) return 0;
        backTrack(list, s);
        return list.size();
    }
    
    public void backTrack(List<String> list, String s){
    	if(s.length() == 0){
    		return;
    	}
    	
    	for(int i = 0; i < s.length(); i++){
    		if(!isPalindrome(s.substring(0, i + 1))){
    			list.add(s.substring(0, i));
    			backTrack(list, s.substring(i));
    		}
    	}
    }
    
    public static boolean isPalindrome(String s){
    	int start = 0, end = s.length() - 1;
    	while(start < end){
    		if(s.charAt(start) != s.charAt(end)){
    			return false;
    		}
    	}
    	return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
