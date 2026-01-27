# class Solution:
#     def maxSumDivThree(self, nums: List[int]) -> int:
#         cnt = defaultdict(list)
#         for i in nums:
#             insort(cnt[i % 3], i)
#         res = 0

#         def count_sum(cur, i):
#             n = len(cur)
#             if n < 1:
#                 return 0
#             matching = cur[n - 1] - (cur[n - 1 - i] if n - 1 - i >= 0 else 0)
#             group_of_3 = cur[n - 1 - i] - (cur[(n - i) % 3 - 1] if (n - i) % 3 > 0 else 0) if n - 1 - i > 1 else 0
#             return matching + group_of_3
#         cnt[1], cnt[2] = (list(accumulate(cnt[1])), list(accumulate(cnt[2])))
#         for i in range(min(len(cnt[1]), len(cnt[2])) + 1):
#             res = max(res, count_sum(cnt[1], i) + count_sum(cnt[2], i))
#         res = res + sum(cnt[0])
#         return res


class Solution:
    def maxSumDivThree(self, A):
        dp = [0, 0, 0]
        for a in A:
            for i in dp[:]:
                dp[(i + a) % 3] = max(dp[(i + a) % 3], i + a)
        return dp[0]
