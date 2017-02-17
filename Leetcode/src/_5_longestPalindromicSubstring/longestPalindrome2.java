package _5_longestPalindromicSubstring;

public class longestPalindrome2 {
	public String longestPalindrome2(String s){
		if(s.length() < 2){
			return s;
	    }
	    
	    String sub = "";
	    int lo = 0, maxlen = 0;
	    for(int i = 0; i < s.length() -1; i++){
	    	int j = i, k = i;
	        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
	        	j--;
	            k++;
	        }
	        if(maxlen < k - j - 1){
	        	lo = j + 1;
	        	maxlen = k - j - 1;
	        }
	        
	        j = i;
	        k = i+1;
	        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
	        	j--;
	            k++;
	        }
	        if(maxlen < k - j - 1){
	        	lo = j + 1;
	            maxlen = k - j - 1;
	        }
	    }
	    return sub = s.substring(lo, lo + maxlen);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
