package _60_permutationSequence;

import java.util.ArrayList;
import java.util.List;

public class getPermutation2 {
	public static String getPermutation(int n, int k) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= n; i++) {
			if(i == 0){
				list.add(0, 1);
				continue;
			}
			list.add(i, i);
		}
		int result = 0;
		while (list.size() > 1) {
			System.out.println("size: " + list.size());
			int index = k / factorial(n - 1);
			int digit = list.get(index);
			System.out.println("digit: " + digit);
			list.remove(index);
			result = result * 10 + digit;
			k = k % factorial(n - 1);
			n = n - 1;
		}
		System.out.println(result);
		return Integer.toString(result);
	}

	public static int factorial(int n) {
		int result1 = 1;
		while (n > 0) {
			result1 = result1 * n;
			n--;
		}
		return result1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getPermutation(1, 1);
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list.get(1));

	}

}
