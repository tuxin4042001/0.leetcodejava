package ReverseString;

import javax.xml.stream.StreamFilter;

public class ReverseString {
	public static String ReverseString(String s) {
		StringBuilder str = new StringBuilder(s);
		System.out.println(str.reverse().toString());
		return str.reverse().toString();
	}
	
	public static void main(String args[]){
		String s="hello";
		ReverseString(s);
	}
}
