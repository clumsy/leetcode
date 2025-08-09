class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        n = len(nums)
        lo, hi = 1, n
        while lo < hi:
            mi = lo + (hi - lo) // 2
            s = sum(i <= mi for i in nums)
            if s > mi:
                hi = mi
            else:
                lo = mi + 1
        return lo
