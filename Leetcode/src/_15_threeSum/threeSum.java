package _15_threeSum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
        	//if(i == 0 || i > 0 && nums[i] != nums[i - 1]), ��Ҫ��Ϊ�˲����ظ�nums[i]����ans�����ظ���L
        	if(i == 0 || i > 0 && nums[i] != nums[i-1]){
        		int start = i + 1;
        		int end = nums.length - 1;
        		//���nums[i] +��nums[start] + nums[end] = 0ʱ������˫ָ��ͬʱ�ƶ�������ֻ���ƶ�һ��
        		while(start < end){
            		if(nums[i] + nums[start] + nums[end] == 0){
            			ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
            			while(start < end && nums[start] == nums[start + 1]) start++;
            			while(start < end && nums[end] == nums[end - 1]) end--;
            			start++;
            			end--;
            		}else if(nums[i] + nums[start] + nums[end] > 0){
            			end--;
            		}else{
            			start++;
            		}
        		}
        	}
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
