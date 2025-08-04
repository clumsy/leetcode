class Solution:
    def minimumRightShifts(self, nums: List[int]) -> int:
        res, mi, n = 0, nums[0], len(nums)
        while n - res - 1 >= 0 and nums[n - res - 1] < mi:
            mi = nums[n - res - 1]
            res += 1
        for i in range(1, n - res - 1):
            if nums[i] < nums[i - 1]:
                res = -1
                break
        return res
