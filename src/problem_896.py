class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        res, s, n = True, 0, len(nums)
        for i in range(1, n):
            d = nums[i] - nums[i - 1]
            if d * s < 0:
                res = False
                break
            s += d
        return res
