package _1_Arrays;

public class _Q11_plusone_M1 {
	public static int[] plusOne(int[] digits) {
		int count = 1;
		int count2 = 0;
		int[] digits2 = new int[digits.length + 1];
		digits2[0] = 1;
		for (int i = 1; i < digits2.length - 1; i++) {
			digits2[i] = 0;
		}

		for (int i = (digits.length - 1); i >= 0; i--) {
			digits[i] = digits[i] + count;
			if (digits[i] < 10) {

				break;
			} else {

				digits[i] = digits[i] % 10;
				count2++;

			}

		}
		if (count2 == digits.length) {
			return digits2;
		} else {
			return digits;
		}
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
