class Solution:
    def absDifference(self, nums: List[int], k: int) -> int:
        nums.sort()
        res = sum(nums[-k:]) - sum(nums[:k])
        return res
