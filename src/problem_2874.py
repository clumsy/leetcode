# class Solution:
#     def maximumTripletValue(self, nums: List[int]) -> int:
#         l_mi = l_ma = nums[0]
#         cnt = Counter(nums[1:])
#         maxs = [-i for i in nums[1:]]
#         heapify(maxs)
#         res, n = (0, len(nums))
#         for j in range(1, n - 1):
#             cnt[nums[j]] = cnt[nums[j]] - 1
#             while cnt[-maxs[0]] == 0:
#                 heappop(maxs)
#             cur = (l_ma - nums[j]) * -maxs[0]
#             res = max(res, cur)
#             l_ma, l_mi = (max(l_ma, nums[j]), min(l_mi, nums[j]))
#         res = max(res, 0)
#         return res

class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        res = maxd = maxi = 0
        for i in nums:
            res = max(res, maxd * i)
            maxd = max(maxd, maxi - i)
            maxi = max(maxi, i)
        return res
