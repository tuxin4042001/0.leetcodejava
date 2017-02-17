package _189_rotateArray;

public class rotate2 {
    public void rotate(int[] nums, int k) {
    	k=k%nums.length;
        rotate2 ro = new rotate2();
        ro.reverse(nums,0,nums.length-1);
        ro.reverse(nums,0,k-1);
        ro.reverse(nums, k, nums.length-1);
        
    }
    
    public void reverse(int[] nums, int start, int end){
    	while(start < end){
    		int temp = nums[start];
    		nums[start] = nums[end];
    		nums[end] = temp;
    		start++;
    		end--;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
