class Solution:
    def maxDistance(self, nums1: List[int], nums2: List[int]) -> int:
        res, n1, n2 = 0, len(nums1), len(nums2)
        for i in range(n1):
            if n2 - i < res:
                break
            lo, hi = 0, n2 - 1
            while lo < hi:
                mi = hi - (hi - lo) // 2
                if nums2[mi] < nums1[i]:
                    hi = mi - 1
                else:
                    lo = mi
            res = max(res, lo - i)
        return res
