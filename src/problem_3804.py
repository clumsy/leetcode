class Solution:
    def centeredSubarrays(self, nums: List[int]) -> int:
        n = len(nums)
        res = 0
        for b in range(n):
            unqs, sums = set(), 0
            for e in range(b, n):
                unqs.add(nums[e])
                sums += nums[e]
                res += sums in unqs
        return res
