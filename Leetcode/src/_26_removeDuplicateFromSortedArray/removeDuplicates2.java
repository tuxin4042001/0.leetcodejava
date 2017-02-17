package _26_removeDuplicateFromSortedArray;

public class removeDuplicates2 {
    public static int removeDuplicates(int[] nums) {
    	if(nums.length < 2) 
    		return nums.length;
    	
        int start = 1;
        for(int i = 1; i < nums.length; i++){
        	if(nums[i] > nums[i - 1]){
        		nums[start++] = nums[i]; 
        	}
        }
        return start;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {1,1};
		int i = removeDuplicates(nums);
        System.out.println(i);
	}

}
