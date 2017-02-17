package _190_reverseBits;

import java.util.Arrays;

public class reverseBits {
	//My solution
	public int reverseBits(int n){
		int[] array = intToBits(n);
		reverseArray(array);
		int result = bitsToInt(array);
		return result;
	}

	public int[] intToBits(int n){
		int index = 0;
		int[] result = new int[10];
		while(n > 0){
			if(n%2 == 0){
				result[index] = 0;
	        }else{
	        	result[index] = 1;
	        }
	        n = n/2;
	        index++;
	    }
	    return result;
	}

	public int bitsToInt(int[] array){
		int result = 0;
		for(int i = 0; i < array.length; i++){
			result = (int) (result + array[i]*Math.pow(2,i));
	    }
	    return result;
	}
	
	public int[] reverseArray(int[] array){
		int start = 0;
		int end = array.length - 1;
		int temp;
		while(start < end){
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(Math.pow(2, 31));

	}

}
