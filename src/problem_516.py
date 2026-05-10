class Solution:
    def longestPalindromeSubseq(self, s: str) -> int:
        n = len(s)
        dp = [[0] * n for _ in range(n)]
        for i in range(n):
            for j in range(n):
                dp[i][j] = max(
                    dp[i - 1][j] if i > 0 else 0,
                    dp[i][j - 1] if j > 0 else 0,
                    (dp[i - 1][j - 1] if i > 0 and j > 0 else 0) + (s[i] == s[n - j - 1]),
                )
        res = dp[n - 1][n - 1]
        return res
