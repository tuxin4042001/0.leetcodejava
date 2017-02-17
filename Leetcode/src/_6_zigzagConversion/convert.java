package _6_zigzagConversion;


//本题的关键是新建一个StringBuffer[] sb = new StringBuffer[numRows],建立一个二维的StringBuffer数组
//①利用StringBuffer[]垂直，斜上存储s.toCharArray()的内容；
//②注意两个for循环里面还需要添加i<len限制条件，注意随时监控i，不能使得i>len
//③最后输出的时候利用for巡皇将sb[0].append(sb[idx])连接起来，然后return sb[0].toString()
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