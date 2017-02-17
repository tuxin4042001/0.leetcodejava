package _1_Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _Q10_PascalsTriangle2_M1 {
	public static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row = null;
		List<Integer> pre = null;
		// ++res_index说明res_index的最大值为rowIndex-1
		/*本题的关键在于两点：
		1.res_index决定了row.length，两者大小是一致的，例如第2行1,1 元素个数也是2；
		2.List的操作,List.add  List.get，跟Array的操作还是不一样；*/
		for (int res_index = 0; res_index < rowIndex+1; ++res_index) {
			row = new ArrayList<Integer>();
			for (int row_index = 0; row_index <= res_index; ++row_index) {
				if (row_index == 0 || row_index == res_index) {
					row.add(1);
				} else {
					row.add(pre.get(row_index - 1) + pre.get(row_index));
				}
			}
			pre = row;
			res.add(row);

		}
		return pre;

	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<Integer> row = getRow(5);
		Iterator<Integer> it = row.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}

	}
}
