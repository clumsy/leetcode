class Solution:
    def resultsArray(self, nums: List[int], k: int) -> List[int]:
        res, d1 = [], 1
        for i in range(len(nums)):
            if i:
                d1 = min(k, d1 + 1) if nums[i] - nums[i - 1] == 1 else 1
            if i + 1 >= k:
                res.append(nums[i] if d1 == k else -1)
        return res

# class Solution:
#     def resultsArray(self, nums: List[int], k: int) -> List[int]:
#         cnt, d1 = Counter(), 0
#         res, ma, sgl = [], [], 0
#         for i, e in enumerate(nums):
#             cnt[e] += 1
#             if i > 0:
#                 d1 += e - nums[i - 1] == 1
#             if i + 1 > k:
#                 sgl -= cnt[nums[i - k]] == 1
#                 cnt[nums[i - k]] -= 1
#                 d1 -= nums[i + 1 - k] - nums[i - k] == 1
#             sgl += cnt[e] == 1
#             heappush(ma, -e)
#             if i + 1 >= k:
#                 while cnt[-ma[0]] == 0:
#                     heappop(ma)
#                 cur = -ma[0] if d1 == k - 1 else -1
#                 res.append(cur)
#         return res
