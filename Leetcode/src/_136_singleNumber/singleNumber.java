package _136_singleNumber;

import java.util.HashSet;
import java.util.Iterator;

public class singleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : nums){
            Integer num = new Integer(n);
            if(!set.add(num)){
                set.remove(num);
            }
        }
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            return iter.next().intValue();
        }
        return 0;
    }
    
    public int singleNumber2(int[] nums) {
        int result = 0;
        for(int n : nums){
        	result ^= n;
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int j = 4;
		int k = 5;
		int f = 5;
		System.out.println(i ^= j);
		System.out.println(i ^= k);
		System.out.println(i ^= f);
	}

}
