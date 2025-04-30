class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        top1, top2 = 0, None
        for i in range(1, len(nums)):
            if nums[i] >= nums[top1]:
                top1, top2 = i, top1
            elif top2 is None or nums[i] > nums[top2]:
                top2 = i
        res = top1 if nums[top1] >= 2 * nums[top2] else -1
        return res
