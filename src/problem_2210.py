class Solution:
    def countHillValley(self, nums: List[int]) -> int:
        res, n, j = 0, len(nums), 0
        for i in range(1, n - 1):
            if (
                (nums[j] < nums[i] and nums[i] > nums[i + 1]) or
                (nums[j] > nums[i] and nums[i] < nums[i + 1])
            ):
                res += 1
                j = i
        return res
