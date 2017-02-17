package _1_Arrays;

//�����ҵ������Сֵ��ֵ
//http://www.cnblogs.com/TenosDoIt/p/3436457.html
public class _Q2_maxProfit_M1 {
	public static int maxProfit(int[] prices) {
		int currentMinPrice = prices.length > 0 ? prices[0] : 0;
		int profit = 0;
		for (int i = 0; i < prices.length; i++) {
			currentMinPrice = Math.min(currentMinPrice, prices[i]);
			profit = Math.max(profit, prices[i] - currentMinPrice);
		}
		System.out.println(profit);
		return profit;

	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] a1 = new int[] { 1, 2, 3, 6, 4, 3, 2 };
		maxProfit(a1);

	}

}
