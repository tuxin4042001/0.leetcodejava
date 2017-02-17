package RomanToInt;

public class RomanToInt {
	public static boolean isRoman(String str){
		char[] roman = {'I','V','X','L','C','D','M'};
		int[] roman_2 = new int[str.length()];
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='I') roman_2[i]=1;
			else if(str.charAt(i)=='V') roman_2[i]=5;
			else if(str.charAt(i)=='X') roman_2[i]=10;
			else if(str.charAt(i)=='L') roman_2[i]=50;
			else if(str.charAt(i)=='C') roman_2[i]=100;
			else if(str.charAt(i)=='D') roman_2[i]=500;
			else if(str.charAt(i)=='M') roman_2[i]=1000;
			else roman_2[i]=0;
            System.out.println(roman_2[i]);
		}
		
		if(str.length()==0){
			System.out.println("0");
			return false;		
		}
		
		if(str.length()>=1){
			for(int j=0;j<str.length();j++){
				if(roman_2[j]==0){
					System.out.println("1");
					return false;
				}
			}
		}
		
		if(str.length()>=2){
		for(int j=0;j<str.length()-1;j++){
			
			if (roman_2[j]!=1 & roman_2[j]!=10 & roman_2[j]!=100){
				System.out.println(j);
				if(roman_2[j]<roman_2[j+1]){
					System.out.println("2_1");
					return false;
				}
			}	
			if(roman_2[j]==1){
				if(roman_2[j+1]!=1|roman_2[j+1]!=5|roman_2[j+1]!=10){	
					System.out.println("2");
					return false;			
				}
			}
			if(roman_2[j]==10){
				if(roman_2[j+1]!=10|roman_2[j+1]!=50|roman_2[j+1]!=100){	
					System.out.println("2");
					return false;
				}
			}
			if(roman_2[j]==100){
				if(roman_2[j+1]!=100|roman_2[j+1]!=500|roman_2[j+1]!=1000){
					System.out.println("2");
					return false;						
				}
			}
		}
		}
			
		else if(str.length()>=3){
			for(int j=0;j<str.length();j++){
				if(roman_2[j]<roman_2[j+2]){
					System.out.println("3");
					return false;
				}
			}
		}
			
		else if(str.length()>=4){
			for(int j=0;j<str.length();j++){
				if(roman_2[j]<=roman_2[j+3]){
					System.out.println("4");
					return false;
				}
		}
	}
			
	    return true;
	}
		
	public static int RomanToInt(String str){
		char[] roman = {'I','V','X','L','C','D','M'};
		int[] roman_2 = new int[str.length()];
		int temp = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='I') roman_2[i]=1;
			if(str.charAt(i)=='V') roman_2[i]=5;
			if(str.charAt(i)=='X') roman_2[i]=10;
			if(str.charAt(i)=='L') roman_2[i]=50;
			if(str.charAt(i)=='C') roman_2[i]=100;
			if(str.charAt(i)=='D') roman_2[i]=500;
			if(str.charAt(i)=='M') roman_2[i]=1000;
		}
		if(str.length()==0)return 0;
		for(int j=0;j<str.length()-1;j++){
			if(roman_2[j]<roman_2[j+1]){
				temp-=roman_2[j];
			}
			else{temp+=roman_2[j];
				
			}
		}
		temp+=roman_2[str.length()-1];
		return temp;
	}
	
	public static String IntToRoman(int num){
		int[][] Int = {{0,  0,  0,  0,  0,  0,  3000,2000,1000},
				       {900,800,700,600,500,400,300 ,200 ,100 },
				       {90, 80, 70, 60, 50, 40, 30  ,20  ,10  },
				       {9,  8,  7,  6,  5,  4,  3,   2,   1   }
		              };
	    String[][] roman = {{"null","null","null","null","null","null","MMM","MM","M"},
	    		            {"CM","DCCC","DCC","DC","D","CD","CCC","CC","C"},
	    		            {"XC","LXXX","LXX","LX","L","XL","XXX","XX","X"},
	    		            {"IX","VIII","VII","VI","V","IV","III","II","I"}
	                  };
	    String str = "";
	    while(num!=0){
	    	 for(int i=0;i<Int.length;i++){
	 	    	for(int j=0;j<Int[i].length;j++){
	 	    		if(Int[i][j]!=0 & num-Int[i][j]>=0){
	 	    			str += roman[i][j];
	 	    			num -= Int[i][j];
	 	    		}
	 	    	}
	    	 }
		}
	    return str;
	}
	
	public static void main(String args[]){
		boolean result_1 = isRoman("DDD");
		
		String result_2 = IntToRoman(3997);
		int result_3 = RomanToInt(result_2);
		System.out.println(result_2);
		System.out.println(result_3);
	}

}
