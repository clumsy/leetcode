# class Solution:
#     def numberOfSubarrays(self, nums: List[int], k: int) -> int:
#         n = len(nums)
#         res = b = e = fst = lst = 0
#         cur = nums[0] & 1
#         while b < n:
#             lst = e
#             while e + 1 < n and (cur < k or nums[e + 1] & 1 == 0):
#                 e = e + 1
#                 if nums[e] & 1 == 1:
#                     lst = e
#                     cur = cur + 1
#             fst = b
#             while fst < lst and nums[fst] & 1 == 0:
#                 fst = fst + 1
#             res = res + ((e - lst + 1) * (fst - b + 1) if cur == k else 0)
#             b = fst + 1
#             cur = max(0, cur - 1)
#         return res


class Solution:
    def numberOfSubarrays(self, nums: List[int], k: int) -> int:
        def at_most(x):
            res = i = 0
            for j in range(len(nums)):
                x = x - (nums[j] & 1)
                while x < 0:
                    x = x + (nums[i] & 1)
                    i = i + 1
                res = res + (j - i + 1)
            return res

        res = at_most(k) - at_most(k - 1)
        return res
