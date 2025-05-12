class Solution:
    def minSum(self, nums1: List[int], nums2: List[int]) -> int:
        s1, s2 = sum(nums1), sum(nums2)
        z1, z2 = sum(i == 0 for i in nums1), sum(i == 0 for i in nums2)
        if (s1 - s2 < z2 and z1 == 0) or (s2 - s1 < z1 and z2 == 0):
            res = -1
        else:
            res = max(s1 + z1, s2 + z2)
        return res
