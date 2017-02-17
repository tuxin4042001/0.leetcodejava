package ExcelSheetColumnNumber;

public class getColumnNumber {
	public int getColumnNumber(String s){
		int num = 0;
		//Excel的Column Name是一个26进制数，以26进制为单位递增;
		for(int i=s.length();i>0;i--){
			num += (s.charAt(i-1)-'A'+1)*Math.pow(26, s.length() - i);			
		}
		return num;
	}
	
	public static void main(String args[]){
		getColumnNumber getnum = new getColumnNumber();
		int num2 = getnum.getColumnNumber("BA");
		System.out.println(num2);
	}
}

