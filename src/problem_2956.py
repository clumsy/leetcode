class Solution:
    def findIntersectionValues(self, nums1: List[int], nums2: List[int]) -> List[int]:
        set1, set2 = set(nums1), set(nums2)
        res = sum(i1 in set2 for i1 in nums1), sum(i2 in set1 for i2 in nums2)
        return res
