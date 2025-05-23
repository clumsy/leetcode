class Solution:
    def minimumCoins(self, prices: List[int]) -> int:
        n = len(prices)
        dp = [inf] * n
        for i in range(min(n, 2)):
            dp[i] = prices[0]
        for i in range(1, n):
            for j in range(i, min(n, i + 1 + i + 1)):
                dp[j] = min(dp[j], dp[i - 1] + prices[i])
        res = dp[-1]
        return res
