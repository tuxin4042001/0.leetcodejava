package _202_happyNumber;

import java.util.HashSet;
import java.util.Set;

public class isHappy {
    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        int squareSum;
        int remain;
        while(inLoop.add(n)){
        	squareSum = 0;
        	while(n > 0){
        		remain = n%10;
        		squareSum += remain*remain;
        		n /= 10;
        	}
        	if(squareSum == 1){
        		return true;
        	}else{
        		n = squareSum;
        	}
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
