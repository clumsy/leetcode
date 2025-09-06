class Solution:
    def minimumSize(self, nums: List[int], maxOperations: int) -> int:
        lo, hi = 1, max(nums)
        while lo < hi:
            mi = lo + (hi - lo) // 2
            x = sum(ceil(i / mi) - 1 for i in nums)
            if x <= maxOperations:
                hi = mi
            else:
                lo = mi + 1
        return lo
