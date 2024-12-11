class Solution:
    def constructTransformedArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [nums[(i + e) % n] for i, e in enumerate(nums)]
        return res
