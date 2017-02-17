package _132_palindromePartition2;

import _28_implementStrstr.strStr;

public class minCut {
    public static int minCut(String s) {
    	int len = s.length();
    	
        if(s == null || s.length() == 0){
        	return 0;
        }
        
        boolean[][] palindMartix = new boolean[len][len];
        
        //cut数组, cut[i]记录s.charAt(i)到s.charAt(s.length() - 1)的minCut
        int[] cut = new int[len + 1];
        
        //初始化cut数组,从最糟糕的情况开始考虑, 假设s中没有一个palindrome,例如 a b c d e, 则cut[]为 5 4 3 2 1 0
        for(int i = 0; i < cut.length; i++){
        	cut[i] = len - i - 1;
        }
        
        //利用DP的方法更新boolean[][] palindMatix举证，如果遇到palindrome就更新cut[i]
        for(int i = len - 1; i >= 0; i--){
        	for(int j = i; j < len; j++){
        		if(s.charAt(i) == s.charAt(j) && j - i < 2 || s.charAt(i) == s.charAt(j) && palindMartix[i + 1][j - 1] == true){
        			palindMartix[i][j] = true;
        			cut[i] = Math.min(cut[i], cut[j + 1] + 1);
        			System.out.printf("substring(%d, %d) %s is palindrome: %s %n", i, j, s.substring(i, j + 1), s.substring(i, j + 1));
        			System.out.printf("cut[%d] update to: %d %n", i, cut[i]);
        		}
        	}
        }
        
        return cut[0];
    }
    
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str = "abcba";
		int minCut = minCut(str);

	}

}
