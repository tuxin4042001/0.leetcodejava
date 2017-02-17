package _131_palindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class partition_test2 {
    public static List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> tempList = new ArrayList<String>();
        if(s.length() == 0) return list;
        backTrack(list, tempList, s, 0);
        return list;
    }
    
    public static void backTrack(List<List<String>> list, List<String> tempList, String s, int start){
    	if(start >= s.length()){
    		list.add(new ArrayList<String>(tempList));
    		return;
    	}
    	
    	for(int i = start; i < s.length(); i++){
    		//只有在s.substring(start, i + 1)是palindrome的情况下,才有tempList.add  backTrack  tempList.remove
    		if(isPalindrome(s, start, i)){
    			tempList.add(s.substring(start, i + 1));
    			
    			System.out.println("tempList add: " + s.substring(0, i + 1));
    			System.out.print("tempList: ");
    			for (String str : tempList) {
    				System.out.print(str + "=> ");
    			}
    			System.out.println();
    			
    			backTrack(list, tempList, s, i + 1);
    			
        		System.out.println("tempList remove: " + tempList.get(tempList.size() - 1));
        		System.out.print("tempList: ");
        		for(String str : tempList){
        			System.out.print(str + "=> ");
        		}
        		System.out.println();
        		
    			tempList.remove(tempList.size() - 1);
    		}
    	}
    }
    
    public static boolean isPalindrome(String s, int start, int i){
    	if(start == i) return true;
    	while(start < i){
    		if(s.charAt(start) != s.charAt(i)) return false;
    		start++;
    		i--;
    	}
    	return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaa";
		List<List<String>> list = partition(str);

	}

}
