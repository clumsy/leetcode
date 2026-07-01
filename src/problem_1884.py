class Solution:
    def twoEggDrop(self, n: int) -> int:
        dp, res = [0] * (n + 1), 0
        for i in range(1, n + 1):
            dp[i] = dp[i - 1] + 1  # one more than previous level or ...
            for j in range(1, i):
                # it broke j, checking one by one
                # unbroken, solving smaller problem i - j - 1
                dp[i] = min(dp[i], 1 + max(j, dp[i - j - 1]))
            res = max(res, dp[i])
        return dp[n]
