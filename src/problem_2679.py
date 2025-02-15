class Solution:
    def matrixSum(self, nums: List[List[int]]) -> int:
        for r in nums:
            r.sort()
        res = 0
        for c in range(len(nums[0])):
            res += max(nums[r][c] for r in range(len(nums)))
        return res
