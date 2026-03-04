class Solution:
    def fourSumCount(self, nums1: List[int], nums2: List[int], nums3: List[int], nums4: List[int]) -> int:
        n, cnt12, cnt34 = len(nums1), Counter(), Counter()
        for i in range(n):
            for j in range(n):
                cnt12[nums1[i] + nums2[j]] += 1
                cnt34[nums3[i] + nums4[j]] += 1
        res = 0
        for c in cnt12:
            res += cnt12[c] * cnt34[-c]
        return res
