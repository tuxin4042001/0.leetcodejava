
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "11";
		String str2 = "1";
		String str3;
		int i = Integer.parseInt(str, 2);
		int j = Integer.parseInt(str2,2);
		int k = i + j;
		str3 = Integer.toString(k, 2);
		System.out.println(k + " " + str3);
    
	}

}
