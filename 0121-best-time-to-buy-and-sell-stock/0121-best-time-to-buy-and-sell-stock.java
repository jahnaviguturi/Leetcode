class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0) return 0;

        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i = 0; i < n; i++) {
            int currentProfit = prices[i] - minPrice;

            if(currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}