class Solution:
    def minMoves2(self, nums: List[int]) -> int:
        nums.sort()
        res = sum(abs(i - nums[len(nums) // 2]) for i in nums)
        return res
