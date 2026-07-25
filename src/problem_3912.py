class Solution:
    def findValidElements(self, nums: list[int]) -> list[int]:
        n = len(nums)
        val = [False] * n
        val[0] = val[-1] = True
        lo = nums[0]
        for i in range(1, n - 1):
            val[i] = nums[i] > lo
            lo = max(lo, nums[i])
        hi = nums[-1]
        for i in reversed(range(1, n - 1)):
            val[i] |= nums[i] > hi
            hi = max(hi, nums[i])
        res = []
        for i in range(n):
            if val[i]:
                res.append(nums[i])
        return res
