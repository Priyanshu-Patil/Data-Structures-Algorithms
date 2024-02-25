class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = prices[0];
        int n = prices.length;

        for (int i = 1; i < n; ++i) {
            if (minValue > prices[i]) {
                minValue = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minValue);
            }
        }

        return maxProfit;
    }
}