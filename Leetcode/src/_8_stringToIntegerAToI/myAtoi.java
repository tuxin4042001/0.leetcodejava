package _8_stringToIntegerAToI;

public class myAtoi {
    public int myAtoi(String str) {
        int index = 0;
        int result = 0;
        int sign = 0;
        String s = "";
        
        if(str == null) return 0;
        
        //deal with the blank space ' ', jump and ignore it
        while(str.charAt(index) == ' ' && index < str.length()){
        	index++;
        }
        
        //deal with sign '+' and '-'
        while(str.charAt(index) == '+' || str.charAt(index) == '-'){
        	sign = (str.charAt(index) == '+')? 1: -1;
        	index++;
        }
        
        while(index < str.length()){
        	int digit = str.charAt(index) - '0';
        	if(digit < 0 || digit > 9){
        		break;
        	}
        	if(Integer.MAX_VALUE/10 < result || (Integer.MAX_VALUE == result && Integer.MAX_VALUE % 10 < digit)){
        		return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        	}
        	result = result * 10 + digit;
            index++;
        }
        
        return result;
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
