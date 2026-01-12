class Solution:
    def getMaximumGenerated(self, n: int) -> int:
        nums = [i for i in range(min(n + 1, 2))]
        res = max(nums)
        for i in range(2, n + 1):
            x = nums[i // 2]
            if i & 1 == 1:
                x += nums[i // 2 + 1]
            res = max(res, x)
            nums.append(x)
        return res
