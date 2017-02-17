package _7_reverseInteger;

public class reverse2 {
	//关键：整数利用取余x%10和乘10来进行位移
	//①取余x%10:取x的最低一位；
	//②乘10:result = result*10 + x%10,进行位移
	//③除10:x/10,去掉x的最低一位
	//④注意为什么要引入newResult，因为例如1534232469反转过来会超出int范围，result = result*10 + x%10的话
	//会变为1052389759，这是需要通过if((newResult - x%10)/10 != result)来验证一下
	public static int reverse2(int x) {
		int result = 0;
		while (x != 0) {
			int newResult = result * 10 + x % 10;
			if ((newResult - x % 10) / 10 != result) {
				return 0;
			}
			result = newResult;
			x /= 10;

		}
		return result;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
