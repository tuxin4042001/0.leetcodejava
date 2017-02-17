package _28_implementStrstr;

public class strStr {
	public int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}

	public int strStr2(String haystack, String needle) {
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {
				if (j == needle.length()) {
					return i;
				}
				if (i + j == haystack.length()) {
					return -1;
				}
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
