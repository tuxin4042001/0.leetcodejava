package ContainDuplicate;

import java.util.Arrays;

public class ContainDuplicate {
	public boolean ContainDuplicate(int[] num){
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]==num[j]){
					return true;
				}
			}
		}
		return false;
	}
	
public boolean ContainDuplicate_1(int[] num){
	Arrays.sort(num);
	for(int i=1;i<num.length;i++){
		if(num[i]==num[i-1]){return true;}
	}
	return false;
}

public static void main(String args[]){
	ContainDuplicate contain = new ContainDuplicate();
	int[] num = {1,2,3,4,5,6,7,1};
	boolean result = contain.ContainDuplicate_1(num);
	System.out.println(result);
}
}


