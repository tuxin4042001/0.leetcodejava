package _60_permutationSequence;

import java.util.ArrayList;
import java.util.List;

public class getPermutation {
	public String getPermutation(int n, int k) {
		List<Integer> tempList = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			tempList.add(i);
		}

		int[] factorial = factorialRes(n);
		
		String result = getResult(n, k, tempList, factorial);
		
		return result;
	}

	//定义个factorialRes方法，返回一个int[]数组，数组记录了所有(n - 1)！的值，result[n - 1] == (n - 1)!, 
	//这样想求(n - 1)!的时候不用写公式计算，直接取result[n - 1]的值即可
	public int[] factorialRes(int n) {
		int[] result = new int[n];
		result[0] = 1;
		for (int i = 1; i < n; i++) {
			result[i] = i * result[i - 1];
		}
		return result;
	}
	
	//解题思路：https://discuss.leetcode.com/topic/17348/explain-like-i-m-five-java-solution-in-o-n
	//对于[1,2,3,4]来说, 当第一个字符为1时，有1 + 2 3 4/2 4 3...等(n - 1)!种可能，当第一个字符为2时, 有2 + 1 3 4/2 + 1 4 3...等(n - 1)!种可能，
	//①求index: 基于此，我们可以根据k的值推断第一个字符为什么，k = 17，那么第一个数应该为3, 因为17 > 2x6, index = (k - 1)/(n - 1)! = 16/6 = 2
	//注意，为什么计算index的时候使用(k - 1)而不是k? 因为index都从0开始，如果使用k会out of bound of index
	//②添加字符:str.append(tempList.get(index)) = str.append(tempList.get(2)) = str.append(3)
	//③更新数列和k值: 数列为tempList.remove(index), k值为k = k - factorial[tempList.size() - 1]*index = 17 - 6 * 2 = 5
	
	public String getResult(int n, int k, List<Integer> tempList, int[] factorial){
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < n; i++){
			int index = (k - 1)/factorial[tempList.size() - 1];
			String s = Integer.toString(tempList.get(index));
			str.append(s);
			k = k - factorial[tempList.size() - 1]*index;
			tempList.remove(index);
		}
		return str.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		String s = Integer.toString(i);
		System.out.println(s);

	}

}
