class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit;
        for(int i = 0; i < prices.length; i++) {
            profit = prices[i] - min;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
            if(prices[i] < min) {
                min = prices[i];
            }
        }
        return maxProfit;
    }
}
