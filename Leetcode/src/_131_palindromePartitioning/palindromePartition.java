package _131_palindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class palindromePartition {
	public List<List<String>> partition(String s) {
		List<List<String>> list = new ArrayList<List<String>>();
		List<String> tempList = new ArrayList<String>();
		if (s.length() == 0)
			return list;
		backTrack(list, tempList, s);
		return list;
	}

	public void backTrack(List<List<String>> list, List<String> tempList, String s) {
		if (s.length() == 0) {
			list.add(new ArrayList<String>(tempList));
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			if (isPalindrome(s.substring(0, i + 1))) {
				tempList.add(s.substring(0, i + 1));
				backTrack(list, tempList, s.substring(i + 1));
				tempList.remove(tempList.size() - 1);
			}
		}
	}

	public static boolean isPalindrome(String s) {
		int start = 0, end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		String str1 = str.substring(0, 3);
		System.out.println(str1);

	}

}
