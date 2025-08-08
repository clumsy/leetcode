# class Solution:
#     def minOperations(self, nums: List[int], k: int) -> int:
#         last = {}
#         for i, e in enumerate(nums):
#             if e <= k:
#                 last[e] = i
#         res = len(nums) - min(last.values())
#         return res

class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        vals, i = (set(), len(nums) - 1)
        while len(vals) < k:
            if nums[i] <= k:
                vals.add(nums[i])
            i = i - 1
        res = len(nums) - 1 - i
        return res
