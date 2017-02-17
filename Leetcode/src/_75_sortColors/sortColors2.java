package _75_sortColors;

public class sortColors2 {
    public static void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        for(int i = 0; i <= end; i++){

        	while(nums[i] == 2 && i < end){
        		int temp = nums[end];
        		nums[end] = nums[i];
        		nums[i] = temp;
        		System.out.printf("exchange num[%d] and nums[%d] %n", start, i);
        		for(int j : nums){
        			System.out.print(j + " ");
        		}
        		System.out.println();
        		end--;
        	}
        	
        	while(nums[i] == 0 && i > start){
        		int temp = nums[start];
        		nums[start] = nums[i];
        		nums[i] = temp;
        		System.out.printf("exchange num[%d] and nums[%d] %n", start, i);
        		for(int j : nums){
        			System.out.print(j + " ");
        		}
        		System.out.println();
        		start++;	
        	}
        	


        	System.out.printf("current index is: start = %d, end = %d, i = %d %n", start, end, i);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,2};
		sortColors(nums);
		for(int j : nums){
			System.out.print(j + " ");
		}
		System.out.println();
	}

}
