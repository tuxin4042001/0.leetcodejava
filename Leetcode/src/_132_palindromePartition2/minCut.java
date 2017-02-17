package _132_palindromePartition2;

import _28_implementStrstr.strStr;

public class minCut {
    public static int minCut(String s) {
    	int len = s.length();
    	
        if(s == null || s.length() == 0){
        	return 0;
        }
        
        boolean[][] palindMartix = new boolean[len][len];
        
        //cut����, cut[i]��¼s.charAt(i)��s.charAt(s.length() - 1)��minCut
        int[] cut = new int[len + 1];
        
        //��ʼ��cut����,�������������ʼ����, ����s��û��һ��palindrome,���� a b c d e, ��cut[]Ϊ 5 4 3 2 1 0
        for(int i = 0; i < cut.length; i++){
        	cut[i] = len - i - 1;
        }
        
        //����DP�ķ�������boolean[][] palindMatix��֤���������palindrome�͸���cut[i]
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
		// TODO �Զ����ɵķ������
		String str = "abcba";
		int minCut = minCut(str);

	}

}
