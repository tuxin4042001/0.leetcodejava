package _53_maximumSubarray;

public class maxSubArray {
    public int maxSubArray(int[] nums) {
    	int endingHere = nums[0];
    	int sumSoFar = nums[0];
        for(int i = 1; i < nums.length; i++){
        	//�������飬�ȴ�����Ԫ�ء��ĵ���������д�Ԫ�شӴ�Ԫ�ؿ�ʼ���¼��������û�С���Ԫ�ء������ۼ�subArray
        	endingHere = Math.max(endingHere + nums[i], nums[i]);
        	//ÿһ��sum of subArray�����仯��ʱ�򣬴洢��¼sum�Ĵ�ֵ
        	sumSoFar = Math.max(sumSoFar, endingHere);
        }
        
        return sumSoFar;
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
