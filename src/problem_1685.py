class Solution:
    def getSumAbsoluteDifferences(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [0] * n
        l, r = 0, sum(nums[i] - nums[0] for i in range(n))
        for i in range(n):
            if i > 0:
                l += i * (nums[i] - nums[i - 1])
                r -= (n - i) * (nums[i] - nums[i - 1])
            res[i] = l + r
        return res
