class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        neg = zrs = 0
        for i in nums:
            if i > 0:
                break
            if i < 0:
                neg = neg + 1
            else:
                zrs = zrs + 1
        res = max(neg, len(nums) - neg - zrs)
        return res

# class Solution:
#     def maximumCount(self, nums: List[int]) -> int:
#         zro, n = (bisect_left(nums, 0), len(nums))
#         if zro < n and nums[zro] == 0:
#             one = bisect_left(nums, 1, zro)
#         else:
#             one = zro
#         neg, zrs = (zro, one - zro)
#         res = max(neg, len(nums) - neg - zrs)
#         return res
