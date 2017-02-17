package ReverseString;

public class ReserseString2 {
	public static String ReverseString2(String s) {
		char[] c = s.toCharArray();
		int index_first = 0;
		int index_last = s.length() - 1;
		Character temp;
		while (index_last >= index_first) {
			temp = c[index_first];
			c[index_first] = c[index_last];
			c[index_last] = temp;
			index_first++;
			index_last--;
		}

		String str = new String(c);
		System.out.println(str);
		return str;

	}
	
	public static void main(String args[]){
		String test="hello";
		ReverseString2(test);
	}

}
