class Solution:
    def maxSumAfterPartitioning(self, arr: List[int], k: int) -> int:
        n = len(arr)
        dp = [0] * n  # dp[max index seen so far] = max sum
        for i in range(n):
            max_val = 0
            for j in range(min(i + 1, k)):
                max_val = max(max_val, arr[i - j])
                dp[i] = max(dp[i], (dp[i - j - 1] if i - j > 0 else 0) + max_val * (j + 1))
        res = dp[-1]
        return res
