class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        dp = [0] * 3
        for e in nums:
            dp[0] = dp[0] + (e != 1)
            dp[1] = min(dp[0], dp[1] + (e != 2))
            dp[2] = min(dp[1], dp[2] + (e != 3))
        res = dp[-1]
        return res

# class Solution:
#     def minimumOperations(self, nums: List[int]) -> int:
#         n = len(nums)
#         dp = [[0] * 3 for _ in range(n + 1)]
#         for i, e in enumerate(nums):
#             mi = inf
#             for k in range(3):
#                 mi = min(mi, dp[i][k])
#                 dp[i + 1][k] = mi + (e != k + 1)
#         res = min(dp[-1])
#         return res
