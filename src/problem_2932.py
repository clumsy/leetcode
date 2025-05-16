class Solution:
    def maximumStrongPairXor(self, nums: List[int]) -> int:
        res, n = 0, len(nums)
        for i in range(n):
            for j in range(i + 1, n):
                if abs(nums[i] - nums[j]) <= min(nums[i], nums[j]):
                    res = max(res, nums[i] ^ nums[j])
        return res
