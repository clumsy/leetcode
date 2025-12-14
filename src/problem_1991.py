class Solution:
    def findMiddleIndex(self, nums: List[int]) -> int:
        n = len(nums)
        for i in range(1, n):
            nums[i] += nums[i - 1]
        res = -1
        for i in range(n):
            if (nums[i - 1] if i > 0 else 0) == nums[-1] - nums[i]:
                res = i
                break
        return res
