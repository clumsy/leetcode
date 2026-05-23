# class Solution:
#     def triangleNumber(self, nums: List[int]) -> int:
#         nums, n, res = (sorted(nums), len(nums), 0)
#         for i in range(n - 2):
#             if nums[i] == 0:
#                 continue
#             k = i + 2
#             for j in range(i + 1, n - 1):
#                 k = bisect_left(nums, nums[i] + nums[j], lo=k)
#                 res = res + (k - j - 1)
#         return res


class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        nums, n, res = (sorted(nums), len(nums), 0)
        for k in range(2, n):
            lo, hi = (0, k - 1)
            while lo < hi:
                if nums[lo] + nums[hi] > nums[k]:
                    res = res + (hi - lo)
                    hi = hi - 1
                else:
                    lo = lo + 1
        return res
