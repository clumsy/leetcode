class Solution:
    def minAbsoluteDifference(self, nums: list[int]) -> int:
        res = v = inf
        p = -inf
        for i, e in enumerate(nums):
            if e == 1 or e == 2:
                if e != v:
                    res = min(res, i - p)
                p, v = i, e
        res = -1 if res is inf else res
        return res
