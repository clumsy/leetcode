class Solution:
    def maxSubarrays(self, nums: List[int]) -> int:
        res = cur = 0
        for e in nums:
            cur = cur & e if cur else e
            res += cur == 0
        res = max(1, res)
        return res
