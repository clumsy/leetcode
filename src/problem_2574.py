class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        lft, rgt, n = 0, sum(nums), len(nums)
        res = [0] * n
        for i in range(n):
            rgt -= nums[i]
            res[i] = abs(rgt - lft)
            lft += nums[i]
        return res
