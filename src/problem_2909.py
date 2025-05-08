# class Solution:
#     def minimumSum(self, nums: List[int]) -> int:
#         lo, n = (nums[0], len(nums))
#         h = nums[1:]
#         heapify(h)
#         res, cnt = (inf, Counter(h))
#         for i in range(1, n - 1):
#             cnt[nums[i]] = cnt[nums[i]] - 1
#             while cnt[h[0]] == 0:
#                 heappop(h)
#             if lo < nums[i] > h[0]:
#                 res = min(res, lo + nums[i] + h[0])
#             lo = min(lo, nums[i])
#         res = -1 if res is inf else res
#         return res

class Solution:
    def minimumSum(self, nums: List[int]) -> int:
        n = len(nums)
        lft = [nums[0]] * n
        rgt = [nums[-1]] * n
        for i in range(1, n):
            lft[i] = min(nums[i], lft[i - 1])
            rgt[n - 1 - i] = min(nums[n - 1 - i], rgt[n - i])
        res = inf
        for i in range(1, n - 1):
            if lft[i - 1] < nums[i] > rgt[i + 1]:
                res = min(res, lft[i - 1] + nums[i] + rgt[i + 1])
        res = -1 if res is inf else res
        return res
