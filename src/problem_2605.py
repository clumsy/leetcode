class Solution:
    def minNumber(self, nums1: List[int], nums2: List[int]) -> int:
        n1, n2 = set(nums1), set(nums2)
        same = n1 & n2
        res = [min(same)] if same else sorted([min(nums1), min(nums2)])
        res = int("".join(str(i) for i in res))
        return res
