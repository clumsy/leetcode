class Solution:
    def mergeArrays(self, nums1: List[List[int]], nums2: List[List[int]]) -> List[List[int]]:
        i1 = i2 = 0
        n1, n2 = len(nums1), len(nums2)
        res = []
        while i1 < n1 or i2 < n2:
            i = min(nums1[i1][0] if i1 < n1 else inf, nums2[i2][0] if i2 < n2 else inf)
            v = 0
            if i1 < n1 and nums1[i1][0] == i:
                v += nums1[i1][1]
                i1 += 1
            if i2 < n2 and nums2[i2][0] == i:
                v += nums2[i2][1]
                i2 += 1
            res.append([i, v])
        return res
