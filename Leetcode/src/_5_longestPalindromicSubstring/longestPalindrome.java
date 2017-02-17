package _5_longestPalindromicSubstring;

import _110_BalancedBinaryTree.isBalanced;

public class longestPalindrome {

	public static String longestPalindrome(String s) {
		if (s.length() == 1 || s.length() == 0) {
			return s;
		}

		if (s.length() == 2) {
			if (s.charAt(0) == s.charAt(1)) {
				return s;
			} else {
				return s.substring(1); // String.substring(int begin);
			}
		}

		String sub = "";
		for (int i = 2; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 2)) {
				//System.out.println("channel 1");
				int j, k;
				for (j = i - 2, k = i; j >= 0 && k < s.length(); j--, k++) {
					if (s.charAt(j) != s.charAt(k)) {
						break;
					}
				}
				//System.out.println("i = " + i);
				//System.out.println("j = " + j);
				//System.out.println("k = " + k);
				//System.out.println("sub = " + sub);
				if (sub.length() < s.substring(j + 1, k).length()) {
					sub =  s.substring(j + 1, k);
				}
				//System.out.println("sub = " + sub);
				//System.out.println();
			}

		}
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				//System.out.println("channel 2");
				int j, k;
				for (j = i - 1, k = i; j >= 0 && k < s.length(); j--, k++) {
					if (s.charAt(j) != s.charAt(k)) {
						break;
					}
				}
				//System.out.println("i = " + i);
				//System.out.println("j = " + j);
				//System.out.println("k = " + k);
				//System.out.println("sub = " + sub);
				if (sub.length() < s.substring(j + 1, k).length()) {
					sub = s.substring(j + 1, k);
				}
				//System.out.println("sub = " + sub);
				//System.out.println();
			}
		}
		if(sub == ""){
		    return s.substring(s.length()-1);
		}else{
		    return sub;
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String str1 = str.substring(0, 2);
		//System.out.println(longestPalindrome(str));
		//System.out.println(str1);

	}

}
