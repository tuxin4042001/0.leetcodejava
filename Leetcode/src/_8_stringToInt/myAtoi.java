package _8_stringToInt;

public class myAtoi {
	public static int myAtoi(String str) {
		int index = 0;
		int result = 0;
		int sign = 1;

		if (str.length() == 0){
			return 0;
		}

		while (str.charAt(index) == ' ' && index < str.length()) {
			index++;
		}

		if (str.charAt(index) == '+' || str.charAt(index) == '-') {
			sign = (str.charAt(index) == '+') ? 1 : -1;
			index++;
		}

		while (index < str.length()) {
			int digit = (int) (str.charAt(index) - '0');
			if (digit < 0 || digit > 9) {
				break;
			}

			if (result > Integer.MAX_VALUE / 10
					|| (result == Integer.MAX_VALUE/10
					&& digit > Integer.MAX_VALUE % 10)) {
				return sign == 1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
			} 
				result = result * 10 + digit;
				index++;		
		}
		return result*sign;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str = "2147483648";
		System.out.println(myAtoi(str));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

	}

}
