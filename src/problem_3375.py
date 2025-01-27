class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        mi, uq = min(nums), set(nums)
        res = len(uq) - (mi == k) if mi >= k else -1
        return res
