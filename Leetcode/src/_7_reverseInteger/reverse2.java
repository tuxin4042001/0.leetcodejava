package _7_reverseInteger;

public class reverse2 {
	//�ؼ�����������ȡ��x%10�ͳ�10������λ��
	//��ȡ��x%10:ȡx�����һλ��
	//�ڳ�10:result = result*10 + x%10,����λ��
	//�۳�10:x/10,ȥ��x�����һλ
	//��ע��ΪʲôҪ����newResult����Ϊ����1534232469��ת�����ᳬ��int��Χ��result = result*10 + x%10�Ļ�
	//���Ϊ1052389759��������Ҫͨ��if((newResult - x%10)/10 != result)����֤һ��
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
		// TODO �Զ����ɵķ������

	}

}
