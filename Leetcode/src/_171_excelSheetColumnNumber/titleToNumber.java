package _171_excelSheetColumnNumber;

public class titleToNumber {
	public static int titleToNumber(String s){
		int result = 0;
		StringBuilder str = new StringBuilder(s);
		str.reverse();
		for(int i = str.length() - 1; i >= 0; i--){
			result = (int) (result + ((int)(str.charAt(i) - 'A') + 1)*(Math.pow(26,i)));
	    }
	    return result;
	}
	
    public int titleToNumber2(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++){
        	result = (int) (result + ((int)(s.charAt(i) - 'A') + 1) * Math.pow(26, Math.abs(i - (s.length() - 1))));
        }
        return result;
    }
    
    public int titleToNumber3(String s) {
        int result = 0;
        for(int i = 0 ; i < s.length(); i++) {
          result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'C';
		int result = (int)(c-'A');
		System.out.println(result);
		
		String s = "AB";
		titleToNumber(s);
	}
	
	

}
