class Solution:
    def maxPairStrength(self, nums: list[int]) -> int:
        res, n = 0, len(nums)
        for i in range(n):
            for j in range(i + 1, n):
                ei, ej = nums[i], nums[j]
                res = max(res, ei * ej // gcd(ei, ej) ** 2)
        return res
