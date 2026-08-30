class Solution:
    def maxSum(self, nums: list[int], k: int, mul: int) -> int:
        nums.sort()
        res = 0
        for i in reversed(range(len(nums))):
            res += nums[i] * max(mul, 1)
            mul = max(0, mul - 1)
            k -= 1
            if k == 0:
                break
        return res
