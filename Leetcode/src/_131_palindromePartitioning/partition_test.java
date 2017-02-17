package _131_palindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class partition_test {
    public static List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> tempList = new ArrayList<String>();
        if(s.length() == 0) return list;
        backTrack(list, tempList, s);
        return list;
    }
    
    public static void backTrack(List<List<String>> list, List<String> tempList, String s){
    	if(s.length() == 0){
    		list.add(new ArrayList<String>(tempList));
    		return;
    	}
    	
    	for(int i = 0; i < s.length(); i++){
    		if(isPalindrome(s.substring(0, i + 1))){
    			tempList.add(s.substring(0, i + 1));
    			
    			System.out.println("tempList add: " + s.substring(0, i + 1));
    			System.out.print("tempList: ");
    			for (String str : tempList) {
    				System.out.print(str + "=> ");
    			}
    			System.out.println();
    			
        		backTrack(list, tempList, s.substring(i + 1));
        		
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
    
    public static boolean isPalindrome(String s){
    	int start = 0, end = s.length() - 1;
    	while(start < end){
    		if(s.charAt(start) != s.charAt(end)){
    			return false;
    		}
    		start++;
    		end--;
    	}
    	return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aab";
		List<List<String>> list = partition(s);
		

	}

}
