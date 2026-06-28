class Solution:
    def gcdSum(self, nums: list[int]) -> int:
        n = len(nums)
        mx, px = [0] * n, [0] * n
        for i in range(n):
            mx[i] = max(nums[i], mx[i - 1] if i else nums[i])
            px[i] = gcd(nums[i], mx[i])
        px.sort()
        res = 0
        for i in range(n // 2):
            res += gcd(px[i], px[n - 1 - i])
        return res
