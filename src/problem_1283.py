class Solution:
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        lo, hi = 1, 1000000
        while lo < hi:
            mi = lo + (hi - lo) // 2
            if sum(ceil(i / mi) for i in nums) <= threshold:
                hi = mi
            else:
                lo = mi + 1
        return lo
