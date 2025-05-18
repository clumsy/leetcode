# class Solution:
#     def minOperations(self, nums1: List[int], nums2: List[int]) -> int:

#         def solve():
#             res = 0
#             for i1, i2 in zip(nums1, nums2):
#                 if i1 > nums1[-1]:
#                     if i2 <= nums1[-1] and i1 <= nums2[-1]:
#                         res = res + 1
#                     else:
#                         return -1
#                 elif i2 > nums2[-1]:
#                     if i1 <= nums2[-1] and i2 <= nums1[-1]:
#                         res = res + 1
#                     else:
#                         return -1
#             return res
#         r1 = solve()
#         nums1[-1], nums2[-1] = (nums2[-1], nums1[-1])
#         r2 = solve()
#         if r2 >= 0:
#             r2 = r2 + 1
#         res = min((r for r in (r1, r2) if r >= 0), default=-1)
#         return res

class Solution:
    def minOperations(self, nums1: List[int], nums2: List[int]) -> int:
        mi, ma = sorted([nums1[-1], nums2[-1]])
        dp_stay = dp_swap = 0
        for i1, i2 in zip(nums1, nums2):
            if max(i1, i2) > ma or min(i1, i2) > mi:
                dp_swap = dp_stay = -1
                break
            if i1 > nums1[-1] or i2 > nums2[-1]:
                dp_stay = dp_stay + 1
            if i1 > nums2[-1] or i2 > nums1[-1]:
                dp_swap = dp_swap + 1
        res = min(dp_stay, dp_swap)
        return res
