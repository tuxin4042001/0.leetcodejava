package _75_sortColors;

public class sortColors {
    public static void sortColors(int[] nums) {
        int index = 0;
        int i = index;
        //排序0，将0元素放到数组的最前列
        while(i < nums.length){
        	if(nums[i] == 0){
        	    int temp = nums[index];
        	    nums[index] = nums[i];
        	    nums[i] = temp;
        		System.out.printf("exchange value: index is: %d; i is: %d; %n", index, i);
        		index++;
        		i++;
        		continue;
        	}
        	i++;
        }
        
		for(int j : nums){
			System.out.print(j + " ");
		}
		System.out.println();
        System.out.printf("after 1st loop: index is: %d; i is: %d; %n", index, i);
        
        i = index;
        //排序1，将1元素放到仅次于0的位置
        while(i < nums.length){
        	if(nums[i] == 1){
        	    int temp = nums[index];
        	    nums[index] = nums[i];
        	    nums[i] = temp;
        		System.out.printf("exchange value: index is: %d; i is: %d; %n", index, i);
        		index++;
        		i++;
        		continue;
        	}
        	i++;
        }
        
		for(int j : nums){
			System.out.print(j + " ");
		}
		System.out.println();
        System.out.printf("after 1st loop: index is: %d; i is: %d; %n", index, i);
        
        i = index;
        //排序1，将1元素放到仅次于0的位置
        while(i < nums.length){
        	if(nums[i] == 2){
        	    int temp = nums[index];
        	    nums[index] = nums[i];
        	    nums[i] = temp;
        		System.out.printf("exchange value: index is: %d; i is: %d; %n", index, i);
        		index++;
        		i++;
        		continue;
        	}
        	i++;
        }
        
		for(int j : nums){
			System.out.print(j + " ");
		}
		System.out.println();
        System.out.printf("after 1st loop: index is: %d; i is: %d; %n", index, i);
    }
    
    public static void swap(int i, int j){
    	int temp = i;
    	i = j;
    	j = temp;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0};
		sortColors(nums);
		for(int i : nums){
			System.out.print(i + " ");
		}
	}

}
