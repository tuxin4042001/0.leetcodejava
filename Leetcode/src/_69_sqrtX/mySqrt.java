package _69_sqrtX;

public class mySqrt {
    public int mySqrt(int x) {
    	if(x < 0) return -1;
    	if(x == 0) return 0;
    	//Ϊʲô�ұ߽�ȡx/2 + 1, ������x? �������x/2 + 1������ͼ�� sqrt(x)������ͼ���ͻᷢ��x/2 + 1��Զ����sqrt(x)������ȡx/2 + 1Ϊ�ұ߽�û����
    	int left = 1, right = x/2 + 1;
    	while(true){
    		int m = (left + right)/2;
    		if(m > x/m){
    			right = m - 1;
    		}else{
    			if((m + 1) > x/(m + 1)){
    				return m;
    			}
    			left = m + 1;
    		}
    	}      
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double i = 2147395599;
		int j = (int)Math.sqrt(i);
		double k = i/2 + 1;
		System.out.println(j);
		System.out.println(k);
		System.out.println(Integer.MAX_VALUE);

	}

}
