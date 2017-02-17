package _9_Palindrome;
public class PalindromeNumber {

	// ����һ����intת��ΪIntegerת��Ϊstring���бȽ��ж�
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

	//���������Ա�ReverseInteger������ȡ���10λ�Ƶķ�����������ת�������ת�������ԭ����ȵĻ�������Palindrome
	//��Ҫ�½�int reserve = x,��Ϊx��ֵ�ڹ����л�ı�
	//���������Ϊ-2147447412�Ļ���������λPalindrome
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