class Solution:
    def smallestRangeI(self, nums: List[int], k: int) -> int:
        ma, mi = 0, inf
        for i in nums:
            mi, ma = min(mi, i), max(ma, i)
        # we can reduce the distance between min and max at most by 2k
        res = max(0, ma - mi - 2 * k)
        return res
