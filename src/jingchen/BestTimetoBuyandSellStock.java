package jingchen;

public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
		int maxdiff = 0, cur = 0, i = 1;
		while (i < prices.length) {
			cur += (prices[i] - prices[i - 1]);
			if (cur < 0)
				cur = 0;
			else
				maxdiff = cur > maxdiff ? cur : maxdiff;
			i++;
		}
		return maxdiff;
	}
}
