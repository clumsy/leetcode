class Solution:
    def numDistinct(self, s: str, t: str) -> int:
        dp = [[0 for j in range(len(s) + 1)] for i in range(len(t) + 1)]
        for j in range(len(s) + 1):
            dp[0][j] = 1
        for i in range(len(t)):
            for j in range(len(s)):
                dp[i + 1][j + 1] = dp[i + 1][j] + (dp[i][j] if t[i] == s[j] else 0)
        return dp[len(t)][len(s)]
