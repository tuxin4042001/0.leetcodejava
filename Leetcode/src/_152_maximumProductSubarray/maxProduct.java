package _152_maximumProductSubarray;

//解题报告：http://blog.csdn.net/worldwindjp/article/details/39826823
//解题思路：1.本题内容：求最大子数组乘积；
//        2.本题也有更新:
//        	a.当数组遇到"0"的时候需要更新，例如{-1,0,9,10},要从9重新开始，重新区分子数组；
//        	b.当数组遇到"-1"的时候不需要更新但需要累积，需要累积最大值最小值，因为你不知道后面是否还有"-1"变号，所以"最大值""最小值"不能丢;
//        	int a = max_temp * nums[i] & int b = min_temp * nums[i],实现了更新，当nums[i] == 0时, a = 0 & b = 0;
//        	max_temp = Math.max(Math.max(a,b), nums[i])实现了累积最大值;
//          min_temp = Math.min(Math.min(a,b), nums[i])实现了累积最小值;
public class maxProduct {    
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int result = nums[0];
        int max_temp = nums[0];
        int min_temp = nums[0];
        for(int i = 1; i < nums.length; i++){
        	int a = max_temp * nums[i];
        	int b = min_temp * nums[i];
        	max_temp = Math.max(Math.max(a, b), nums[i]);
        	min_temp = Math.min(Math.min(a, b), nums[i]);
        	result = Math.max(result, max_temp);
        }
        
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
