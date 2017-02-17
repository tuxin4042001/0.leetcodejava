package _11_containerWithMostWater;

public class maxArea {
	public static int maxArea(int[] height){
		int lh = 0, rh = height.length - 1;
		int leftIndex = lh, rightIndex = rh;
		int maxArea = 0;
		while(lh < rh){
			if(height[lh] < height[rh]){
				leftIndex = lh;
				while(height[leftIndex] < height[lh] && leftIndex < rightIndex){
					leftIndex++;
	            }
	            if(Math.min(height[leftIndex], height[rightIndex])*(rightIndex - leftIndex) > 
	            Math.min(height[lh], height[rightIndex]) * (rightIndex - lh)){
	            	lh = leftIndex;
	            	maxArea = Math.min(height[leftIndex], height[rightIndex])*(rightIndex - leftIndex);
	            }else{
	            	maxArea = Math.min(height[lh], height[rightIndex]) * (rightIndex - lh);
	            }
	        }
	        
	        if(height[rh] < height[lh]){
	        	rightIndex = rh;
	            while(height[rightIndex] < height[rh] && rightIndex > leftIndex){
	            	rightIndex--;
	            }
	            if(Math.min(height[rightIndex], height[leftIndex])*(rightIndex - leftIndex) > 
	            Math.min(height[rh], height[leftIndex]) * (rh - leftIndex)){
	            	rh = rightIndex;
	            	maxArea = Math.min(height[rightIndex], height[leftIndex])*(rightIndex - leftIndex);
	            }else{
	            	maxArea = Math.min(height[rh], height[leftIndex]) * (rh - leftIndex);
	            }
	        }
	    }
		return maxArea;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {2,1,5,7,9,10};
		int area = maxArea(nums);
		System.out.println(area);

	}

}
