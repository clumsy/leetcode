class Solution:
    def maximizeGreatness(self, nums: List[int]) -> int:
        nums.sort()
        res = 0
        for i in nums:
            if i > nums[res]:
                res += 1
        return res
