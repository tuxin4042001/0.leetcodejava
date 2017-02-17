package _168_excelSheetColumnTitle;

public class convertToTitle {
	public String convertToTitle(int n) {
		StringBuilder result = new StringBuilder("");
		while (n != 0) {
			char c = (char) ((n - 1) % 26 + 65);
			result.append(c);
			n = (n - 1) / 26;
		}
		return result.reverse().toString();
	}

	public String convertToTitle2(int n) {
		String result = "";
		while (n != 0) {
			char c = (char) ((n - 1) % 26 + 65);
			result = c + result;
			n = (n - 1) / 26;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
