package _69_sqrtX;

import javax.xml.stream.events.StartDocument;

public class mySqrt2 {
	//����һ:ʹ�ö��ַ���ƽ����
	//     a. ע��x < 0 �� x == 0�����
	//     b. ע��right = x/2 + 1, ע��rightȡֵx/2 + 1���Ѿ�����sqrt(x)��, ����������ͼ��
	//     c. ��ν���ַ���ƽ����, �������ö��ַ��ҵ�һ��ֵ m*m < x && (m + 1)(m +��1) > x, ��ʱmֵΪ����
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
		// TODO �Զ����ɵķ������

	}

}
