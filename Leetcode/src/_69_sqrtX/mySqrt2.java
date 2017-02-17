package _69_sqrtX;

import javax.xml.stream.events.StartDocument;

public class mySqrt2 {
	//方法一:使用二分法求平方根
	//     a. 注意x < 0 和 x == 0的情况
	//     b. 注意right = x/2 + 1, 注意right取值x/2 + 1就已经大于sqrt(x)了, 可以做曲线图看
	//     c. 所谓二分法找平方根, 就是利用二分法找到一个值 m*m < x && (m + 1)(m +　1) > x, 此时m值为所求
	public int mySqrt(int x) {
		if (x < 0)
			return -1;
		if (x == 0)
			return 0;
		int left = 1, right = x / 2 + 1;
		while (true) {
			int mid = (left + right) / 2;
			if (mid > x / mid) {
				right = mid - 1;
			} else {
				if ((mid + 1) > x / (mid + 1)) {
					return mid;
				}
				left = mid + 1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
