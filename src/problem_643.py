from math import inf


class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        res, s = -inf, 0
        for i, e in enumerate(nums):
            s += e
            if i >= k - 1:
                s -= nums[i - k] if i >= k else 0
                res = max(res, s / k)
        return res
