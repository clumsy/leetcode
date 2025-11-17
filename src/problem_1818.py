class Solution:
    def minAbsoluteSumDiff(self, nums1: List[int], nums2: List[int]) -> int:
        MOD = int(1e9) + 7
        n, nums, res, gain = len(nums1), sorted(nums1), 0, 0
        for i in range(n):
            diff = abs(nums1[i] - nums2[i])
            res += diff
            j = bisect_left(nums, nums2[i])
            gain = max(gain, diff - abs(nums[j] - nums2[i]) if j < n else 0)
            gain = max(gain, diff - abs(nums[j - 1] - nums2[i]) if j - 1 < n else 0)
        return (res - gain) % MOD
