package _209_minimumSizeSubarraySum;

public class minSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int length = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;
        while(end < nums.length){
        	sum += nums[end++];
        	while(sum >= s){
        		length = Math.min(length, end - start);
        		sum -= nums[start];
        		start++;
        	}
        }
        return length = (length == Integer.MAX_VALUE)?0:length;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
