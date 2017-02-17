package _31_nextPermutation;

import java.util.Arrays;

public class nextPermutation2 {
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
        	sort(nums, 0, nums.length - 1);
        	return;
        }else{
        	//��index��ʼ������Ҵ���nums[index - 1]����Сֵ��index, ���� 1 2 6 5 4 3(6)(nums[index - 1] = 2)(���6��ʼminValue = 3, minIndex = 5)
        	//����nums[index - 1] = 2��minValue = 3, 1 3 6 5 4 2
        	//��6��ʼ���� 1 3 2 4 5 6��Ϊ���
        	//����1�Ǵ�nums.length - 1��ǰ�ҵ�һ������nums[index - 1]��ֵ
        	//����2�Ǵ�index��������СminValue
        	//��Ϊ�����ж�����һ��sort���̣�ʵ��������һ����
        	int index2 = findMinIndex(nums, index, nums.length - 1, nums[index - 1]);
        	swap(nums, index - 1, index2);
        	sort(nums, index, nums.length - 1);
        }
    }
    
    public int findMinIndex(int[] nums, int start, int end, int val){
    	int index = start;
    	int minIndex = start;
    	int minValue = nums[start];
    	while(index <= end){
    		if(nums[index] < minValue && nums[index] > val){
    		    minIndex = index;
    		    minValue = nums[index];
    		}
    		index++;
    	}
    	return minIndex;
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
		// TODO �Զ����ɵķ������

	}

}
