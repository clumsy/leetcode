class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:
        nums.sort()
        res = [e for l, r in zip(nums[1::2], nums[::2]) for e in (l, r)]
        return res
