package _34_searchForARange;

public class searchRange {
	//����һ:˫ָ�뷽��search
	//     ���nums[start] == target && nums[end] == target, �ͱ�ʾ�ҵ��˽����������Ӧֵ;
	//     ���nums[start] != target, start++�������;
	//     ���nums[end] != target, end--��ǰ����;
	//     �ؼ���Ҫ��ʼ��result = {-1, -1}
    public int[] searchRange(int[] nums, int target) {
    	int[] result = {-1, -1};
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
        	if(nums[start] == target && nums[end] == target){
        	    result[0] = start;
        	    result[1] = end;
        		break;
        	}
        	if(nums[start] != target){
        		start++;
        	}
        	if(nums[end] != target){
        		end--;
        	}
        }
        return result;
    }
    
    //������:���ֲ���
    //�ؼ�����ʹ�ô�ͳ�Ķ��ֲ���,mid = (start + end)/2, nums[mid] < target start = mid, target < nums[mid] end = mid,ֻ���ҵ�������target
    //��������߽�,�м�ֵ,�ұ߽�,��ȷ��
    //a. ���ַ�������߽�: mid = (start + end)/2, nums[mid] <��target start = mid + 1, target <= nums[mid] end = mid
    //b. ���ַ������ұ߽�: mid = (start + end)/2, target < nums[mid] end = mid - 1, target >= nums[mid] start = mid
    public int[] searchRange2(int[] nums, int target) {
    	int[] result = {-1, -1};
    	if(nums.length == 0){
    		return result;
    	}
    	int start = 0; 
    	int end = nums.length - 1;
    	
    	while(start < end){
    		int mid = (start + end)/2;
    		if(nums[mid] < target){
    			start = mid + 1;
    		}else{
    			end = mid;
    		}
    	}
    	if(nums[start] != target){
    		return result;
    	}else{
    		result[0] = start;
    	}
    	
    	end = nums.length - 1;
    	
    	while(start < end){
    		int mid = (start + end)/2 + 1;
    		if(target < nums[mid]){
    			end = mid - 1;
    		}else{
    			start = mid;
    		}
    	}
    	result[1] = end;
    	
    	return result;
        
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
