package _11_containerWithMostWater;

public class maxArea {
    public int MaxArea(int[] height) {
    	int leftIndex = 0, rightIndex = height.length - 1;
    	int lh = height[leftIndex], rh = height[rightIndex];
    	int area = 0;
    	int temp;
    	while(leftIndex < rightIndex){
    		temp = Math.min(lh, rh)*(rightIndex - leftIndex);
    		if(area < temp) area = temp;
    		
    		if(lh < rh){
    			while(leftIndex < rightIndex && height[leftIndex] <= lh){
    				leftIndex++;
    			}
    			if(leftIndex < rightIndex){
    				lh = height[leftIndex];
    			}
    		}else{
    			while(leftIndex < rightIndex && height[rightIndex] <= rh){
    				rightIndex--;
    			}
    			if(leftIndex < rightIndex){
    				rh = height[rightIndex];
    			}
    		}
    	}
    	return area;     
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
