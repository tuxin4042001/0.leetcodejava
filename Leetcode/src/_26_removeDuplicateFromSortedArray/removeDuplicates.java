package _26_removeDuplicateFromSortedArray;

//题解：给定一个sorted数组int[] nums, 删除其中的重复元素并对其重新排序，返回重新排序后的数组的长度
//例子：{1,1,2} --> {1,2,2} result = 2
//关键：设定两个index, index i从前往后遍历数组int[] nums, index start记录当前插入的位置
//    有两种方法判断司否插入元素: a. i > 0 && nums[i] != nums[i - 1]; b. i > 0 && nums[i] > nums[i - 1]
//    之所以可以使用第二种方法是因为int[] nums是sorted的
public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
    	if(nums.length < 2)
    		return nums.length;
    	
        int start = 1;
        for(int i = 1; i < nums.length; i++){
        	if(nums[i] != nums[i - 1]){
            	nums[start++] = nums[i];
        	}
        }
        return start;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {1,1};
		int i = removeDuplicates(nums);
        System.out.printf("length of the result is: %d %n", i);
        for(int n: nums){
        	System.out.print(n);
        }
	}

}
