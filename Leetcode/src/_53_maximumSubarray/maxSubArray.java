package _53_maximumSubarray;

public class maxSubArray {
    public int maxSubArray(int[] nums) {
    	int endingHere = nums[0];
    	int sumSoFar = nums[0];
        for(int i = 1; i < nums.length; i++){
        	//遍历数组，等待“大元素”的到来，如果有大元素从大元素开始重新计数，如果没有“大元素”不断累计subArray
        	endingHere = Math.max(endingHere + nums[i], nums[i]);
        	//每一次sum of subArray发生变化的时候，存储记录sum的大值
        	sumSoFar = Math.max(sumSoFar, endingHere);
        }
        
        return sumSoFar;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
