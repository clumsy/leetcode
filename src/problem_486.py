class Solution:
    def PredictTheWinner(self, nums: List[int]) -> bool:
        _, dp = (n := len(nums)), [0 for _ in range(n)]
        for s in range(n - 1, -1, -1):
            for e in range(s, n):
                # dp[e] === dp[s + 1][e] - from previous iteration on s (s + 1)
                # dp[e - 1] === dp[s][e - 1] - previous iteration on e (e - 1)
                dp[e] = nums[s] if s == e else max(nums[s] - dp[e], nums[e] - dp[e - 1])
        return dp[n - 1] >= 0
