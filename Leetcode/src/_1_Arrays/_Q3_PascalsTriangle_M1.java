package _1_Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class _Q3_PascalsTriangle_M1 {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row = null;
		List<Integer> pre = null;
		// ++res_index˵��res_index�����ֵΪnumRows-1
		/*����Ĺؼ��������㣺
		1.res_index������row.length�����ߴ�С��һ�µģ������2��1,1 Ԫ�ظ���Ҳ��2��
		2.List�Ĳ���,List.add  List.get����Array�Ĳ������ǲ�һ����*/
		for (int res_index = 0; res_index < numRows; ++res_index) {
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
		return res;

	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		List<List<Integer>> res = generate(5);
		Iterator<List<Integer>> it = res.iterator();
		while (it.hasNext()) {
			List<Integer> row = it.next();
			Iterator<Integer> it2 = row.iterator();
			while (it2.hasNext()) {
				Integer i = it2.next();
				System.out.print(i + ", ");
			}
			System.out.println();
		}

	}

}
