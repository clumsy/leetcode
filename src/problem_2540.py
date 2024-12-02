class Solution:
    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        n1, n2 = len(nums1), len(nums2)
        i1 = i2 = 0
        res = -1
        while i1 < n1 and i2 < n2:
            diff = nums1[i1] - nums2[i2]
            if diff == 0:
                res = nums1[i1]
                break
            if diff < 0:
                i1 += 1
            else:
                i2 += 1
        return res
