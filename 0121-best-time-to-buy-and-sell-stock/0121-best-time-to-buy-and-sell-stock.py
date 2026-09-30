class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        n = len(prices)

        min_price = prices[0]
        profit = 0

        for i in range(1, n):
            cur_profit = prices[i] - min_price
            if cur_profit > profit:
                profit = cur_profit
            min_price = min(min_price, prices[i])

        return profit