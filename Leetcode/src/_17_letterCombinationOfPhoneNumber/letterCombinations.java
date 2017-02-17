package _17_letterCombinationOfPhoneNumber;

import java.util.LinkedList;
import java.util.List;

public class letterCombinations {
	public List<String> letterCombinations(String digits){
		LinkedList<String> ans = new LinkedList<String>();
		if(digits.length() == 0) return ans;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		for(int i = 0; i < digits.length(); i++){
			//there are two methods to change character to int
			//1. char c = (int)(digis.charAt(i) - '0')
			//2. char c = Character.getNumericValue(digits.charAt(i));
			int index = Character.getNumericValue(digits.charAt(i));
		    while(ans.peek().length() == i){
			    String temp = ans.remove();
			    for(char c : mapping[index].toCharArray()){
				    ans.add(temp + c);
	            }
	        }
	    }
	    return ans;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
