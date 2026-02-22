class Solution:
    def findMaxForm(self, strs: List[str], m: int, n: int) -> int:
        dp = [[0 for _ in range(n + 1)] for _ in range(m + 1)]
        for s in strs:
            zeros = len(s) - (ones := s.count("1"))
            for z in range(m, zeros - 1, -1):
                for o in range(n, ones - 1, -1):
                    dp[z][o] = max(dp[z][o], dp[z - zeros][o - ones] + 1)
        return dp[m][n]
