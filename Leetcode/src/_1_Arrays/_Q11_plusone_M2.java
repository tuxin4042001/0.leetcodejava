package _1_Arrays;

public class _Q11_plusone_M2 {

	public static int[] plusOne(int[] digits) {
		int[] digits2 = new int[digits.length + 1];
		digits2[0] = 1;
		for (int i = (digits.length - 1); i >= 0; i--) {
			digits[i] = digits[i]+1;
			if (digits[i] < 10) {
				return digits;
			} else {
				digits[i] = 0;
			}
		}
		return digits2;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] digits = { 8, 9, 9, 9, 9, 9 };
		int[] digits3 = plusOne(digits);
		for (int i : digits3) {
			System.out.print(i + " ");
		}

	}

}
