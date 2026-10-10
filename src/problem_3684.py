class Solution:
    def maxKDistinct(self, nums: List[int], k: int) -> List[int]:
        res = nlargest(k, set(nums))
        return res
