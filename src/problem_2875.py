# class Solution:
#     def minSizeSubarray(self, nums: List[int], target: int) -> int:
#         lft, rgt = ({}, {})
#         res, s, n = (inf, sum(nums), len(nums))
#         lo, hi = (0, s)
#         for i, e in enumerate(nums):
#             lft[hi] = n - i
#             hi = hi - e
#             lo = lo + e
#             rgt[lo] = i + 1
#         for rv, r in rgt.items():
#             if (rem := (rv - target)) > 0 and rem in rgt:
#                 res = min(res, r - rgt[rem])
#             d, rem = divmod(target - rv, s)
#             if rem == 0 or rem in lft:
#                 res = min(res, r + (lft[rem] if rem != 0 else 0) + d * n)
#         res = res if res is not inf else -1
#         return res

class Solution:
    def minSizeSubarray(self, nums: List[int], target: int) -> int:
        s, n = (sum(nums), len(nums))
        d, target = divmod(target, s)
        if target == 0:
            res = d * n
        else:
            res, s, dp = (inf, 0, {0: -1})
            for i, e in enumerate(nums + nums):
                s = s + e
                if s - target in dp:
                    res = min(res, i - dp[s - target])
                dp[s] = i
            res = res + d * n if res is not inf else -1
        return res
