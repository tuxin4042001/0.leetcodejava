package _50_powXN;

public class MyPow {
    public double myPow(double x, int n) {
    	//�����ּ�ֵ������£��������0
        if(n == Integer.MIN_VALUE && x > 1)
            return 0;
        if(n == 0) 
        	return 1;
        //��ָ��n < 0��ʱ����취ת��Ϊn > 0�����
        if(n < 0){
        	n = -n;
        	x = 1/x;
        }
        //ʹ�õ����ķ�����myPow(x,n),ע������ʹ�� myPow(x*x,n/2)����ʹ�� myPow(x,n/2)*myPow(x,n/2),ԭ����һ���ģ�����ǰ�߿�ܶ಻�����ε���
        return (n % 2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2); 
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
