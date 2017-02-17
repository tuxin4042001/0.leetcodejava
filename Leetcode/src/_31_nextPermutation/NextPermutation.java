package _31_nextPermutation;

import java.util.Arrays;

import _24_swapNodeInPairs.swapPairs;

public class nextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums.length < 2){
        	return;
        }
        
        int index = nums.length - 1;
        while(index > 0){
        	if(nums[index] > nums[index-1]){
        		break;
        	}
        	index--;
        }
        if(index == 0){
        	reverseSort(nums, 0, nums.length - 1);
        	return;
        }else{
        	int index2 = findMinIndex(nums, index, nums.length - 1, nums[index - 1]);
        	swap(nums, index - 1, index2);
        	sort(nums, index, nums.length - 1);
        }
    }
    
    public void reverseSort(int[] nums, int start, int end){
    	if(start > end){
    		return;
    	}
    	for(int index = start; index <= (start + end)/2; index++){
    		swap(nums, index, start+end-index);
    	}
    }
    
    public int findMinIndex(int[] nums, int start, int end, int val){
    	int index = start;
    	int index2 = start;
    	int temp = nums[start];
    	while(index <= end){
    		if(nums[index] > val && nums[index] < temp){
    			temp = nums[index];
    			index2 = index;
    		}
    		index++;
    	}
    	return index2;
    }
    
    public void swap(int[] nums, int start, int end){
    	int temp = nums[start];
    	nums[start] = nums[end];
    	nums[end] = temp;
    }
    
    public void sort(int[] nums, int start, int end){
    	int[] temp = Arrays.copyOfRange(nums, start, end+1);
    	Arrays.sort(temp);
    	for(int i = start, j = 0; i <= end; i++,j++){
    		nums[i] = temp[j];
    	}
    }
    
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int[] nums = {1,3,3};
//		int[] nums2 = {3, 2, 1, 5, 7, 8};
//		int index = findMinIndex(nums, 1, 2, 1);
//		sort(nums2, 0, nums2.length - 1);
//		for(int i : nums2){
//			System.out.print(i + " ");
//		}

	}

}
