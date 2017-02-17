package _9_Palindrome;
public class PalindromeNumber {

	// 方法一：将int转化为Integer转化为string进行比较判断
	public boolean isPalindrome(int x) {
		Integer num = new Integer(x);
		String str = num.toString();
		int start = 0;
		int end = str.length() - 1;
		while (end > start) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	//方法二：对比ReverseInteger，利用取余乘10位移的方法将整数反转，如果翻转后的数跟原数相等的话，就是Palindrome
	//①要新建int reserve = x,因为x的值在过程中会改变
	//②如果输入为-2147447412的话，负数部位Palindrome
	public static boolean isPalindrome2(int x) {
		int reserve = x;
		int result = 0;
		if (x < 0)
			return false;
		while (x != 0) {
			result = result * 10 + x % 10;
			x /= 10;
			System.out.println("result: " + result);
			System.out.println("x: " + x);
		}
		return result == reserve;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -2147447412;
		System.out.println(PalindromeNumber.isPalindrome2(i));
	}

}