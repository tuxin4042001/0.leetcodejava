package _1_Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _Q10_PascalsTriangle2_M1 {
	public static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row = null;
		List<Integer> pre = null;
		// ++res_index˵��res_index�����ֵΪrowIndex-1
		/*����Ĺؼ��������㣺
		1.res_index������row.length�����ߴ�С��һ�µģ������2��1,1 Ԫ�ظ���Ҳ��2��
		2.List�Ĳ���,List.add  List.get����Array�Ĳ������ǲ�һ����*/
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
		// TODO �Զ����ɵķ������
		List<Integer> row = getRow(5);
		Iterator<Integer> it = row.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}

	}
}
