package _125_validPalindrome;

public class isPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int head = 0, tail = s.length() - 1;
        char chead, ctail;
        while(head <= tail){
        	chead = s.charAt(head);
        	ctail = s.charAt(tail);
        	if(!Character.isLetterOrDigit(chead)){
        		head++;
        	}else if(!Character.isLetterOrDigit(ctail)){
        		tail--;
        	}else{
        		if(Character.toLowerCase(chead) != Character.toLowerCase(ctail)) return false;
            	head++;
            	tail--;
        	}
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
