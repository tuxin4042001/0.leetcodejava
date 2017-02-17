package _22_generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        autoGenerate(res,"",0,0,n);
        return res;
    }
    
    public void autoGenerate(List<String> res, String str, int open, int close, int max){
    	if(str.length() == 2*max){
    		res.add(str);
    		return;
    	}
    	
    	if(open < max){
    		autoGenerate(res, str + "(", open + 1, close, max);
    	}
    	if(close < open){
    		autoGenerate(res, str + ")", open, close + 1, max);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
