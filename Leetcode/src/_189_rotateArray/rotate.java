package _189_rotateArray;

public class rotate {
	public void rotate(int[] nums, int k) {
	    rotate ro = new rotate();
	    if(k < nums.length){
	        nums = ro.rotate2(nums, k);
	        for(int i:nums){
				System.out.print(i + " ");
			}
	    }else{
	        k = k%nums.length;
	        nums = ro.rotate2(nums, k);
	        for(int i:nums){
				System.out.print(i + " ");
			}
	    }
	    System.out.println();
	}
	
	public int[] rotate2(int[] nums, int k){
		int[] result = new int[nums.length];
		for(int i = 0; i < k; i++){
			result[i] = nums[nums.length - k + i];
	    }
	    for(int i = 0; i < nums.length - k; i++){
	    	result[k + i] = nums[i];
	    }
	    return result;
	}
	
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5};
		int k = 2;
		rotate ro = new rotate();
		ro.rotate(nums, k);
		for(int i:nums){
			System.out.print(i + " ");
		}
	}
}

