class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        lo, hi = 0, len(arr)
        while lo < hi:
            mi = lo + (hi - lo) // 2
            if arr[mi] - mi - 1 < k:
                lo = mi + 1
            else:
                hi = mi
        return lo + k
