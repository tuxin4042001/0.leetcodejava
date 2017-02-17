package MajorityElement;

import java.util.Arrays;

public class majorityElement {
	public int majorityElement(int[] num){
		Arrays.sort(num);
		int n = num[num.length/2];
		return n;
	}
	
	public int majorityElement_1(int[] num){
		int vote = num[0];
		int count = 1;
		for(int i=0;i<num.length;i++){
			if(vote == num[i]){count++;}
			else{count--;}
			if(count == 0){vote = num[i];count++;}
		}
		return vote;
	}
	
	public static void main(String args[]){
		int[] num = {1,2,2,2,2,2,2,2,2,3,3,3,3,3,3};
		majorityElement major = new majorityElement();
		int i = major.majorityElement(num);
		int j = major.majorityElement_1(num);
		System.out.println(j);
	}

}
