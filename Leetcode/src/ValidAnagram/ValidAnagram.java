package ValidAnagram;

import java.util.Arrays;

public class ValidAnagram {
	public boolean ValidAnagram(String s1,String s2){
		int j=0;
		int k=0;
		if(s1.length()!= s2.length()){
			return false;
		}
		else{
			for(int i=0;i<s1.length();i++){
				char a = s1.charAt(i);
				char b = s2.charAt(i);
				j += Math.pow(Character.getNumericValue(a), 2);
				k += Math.pow(Character.getNumericValue(b), 2);
			}
		if(j == k ){return true;}
		else{return false;}
		}
	}
	
   public boolean ValidAnagram_1(String s1,String s2){
	   if(s1.length() != s2.length()){
		   System.out.println("length different!");
		   return false;
	   }

		   System.out.println("length same!");
		   char[] valid = new char[26];
		   char[] valid2 = new char[26];
		   for(int i=0;i<s1.length();i++){valid[s1.charAt(i)-'a']++;}
		   for(int j=0;j<s2.length();j++){valid2[s2.charAt(j)-'a']++;}
		   return new String(valid).equals(new String(valid2));
   }
	
   public boolean ValidAnagram_2(String s, String t) {
		    char[] schar = s.toCharArray();
		    char[] tchar = t.toCharArray();
		    Arrays.sort(schar);
		    Arrays.sort(tchar);
	
		    String s1 = new String(schar);
		    String s2 = new String(tchar);
		    if(s1.equals(s2)) return true;
	    else return false;
	}
	   
   public static void main(String args[]){
	   String s1 = "assdddf";
	   String s2 = "sadadad";
	   String s3 = "addssdf";
	   ValidAnagram valid = new ValidAnagram();
	   boolean result = valid.ValidAnagram(s1,s3);
	   boolean result2 = valid.ValidAnagram_1(s1,s3);
	   boolean result3 = valid.ValidAnagram_2(s1,s3);
	   
	   System.out.println(result2);
	   int f = Character.getNumericValue('z');
	   System.out.println(f);
   }
}
