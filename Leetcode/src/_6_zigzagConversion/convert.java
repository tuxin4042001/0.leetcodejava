package _6_zigzagConversion;


//����Ĺؼ����½�һ��StringBuffer[] sb = new StringBuffer[numRows],����һ����ά��StringBuffer����
//������StringBuffer[]��ֱ��б�ϴ洢s.toCharArray()�����ݣ�
//��ע������forѭ�����滹��Ҫ���i<len����������ע����ʱ���i������ʹ��i>len
//����������ʱ������forѲ�ʽ�sb[0].append(sb[idx])����������Ȼ��return sb[0].toString()
public class convert {
	public String convert(String s, int numRows) {
		char[] c = s.toCharArray();
		int len = c.length;
		StringBuffer[] sb = new StringBuffer[numRows];
		for (int i = 0; i < numRows; i++)
			sb[i] = new StringBuffer();
		int i = 0;
		while (i < len) {
			for (int idx = 0; idx < numRows && i < len; idx++) {
				sb[idx].append(c[i++]);
			}
			for (int idx = numRows - 2; idx >= 1 && i < len; idx--) {
				sb[idx].append(c[i++]);
			}
		}
		for(int idx = 1; idx < numRows;idx++){
			sb[0].append(sb[idx]);
		}
		return sb[0].toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}