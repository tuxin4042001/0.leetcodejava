package _80_removeDuplicatesFromSortedArrayII;

public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int countSum = 0;
        int countTemp = 1;
        for(int i = 1; i < nums.length; i++){
        	if(nums[i] == nums[i - 1] && countTemp < 2){
        		countTemp++;
        		System.out.printf("index i(%d) = index i - 1(%d), counTemp++ = %d %n", i, i - 1, countTemp);
        	}
        	
        	if(nums[i] != nums[i - 1]){
        		countSum += countTemp;
        		countTemp = 1;
        		System.out.printf("index i(%d) != index i - 1(%d), countSum = %d, counTemp = %d %n", i, i - 1, countSum, countTemp);
        	}
        }
        
        countSum += countTemp;
        
        return countSum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,2,3,3,3,3,4,4,4,4};
		int result = removeDuplicates(nums);
		System.out.println(result);

	}

}
