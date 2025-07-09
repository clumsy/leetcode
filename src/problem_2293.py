class Solution:
    def minMaxGame(self, nums: List[int]) -> int:
        n = len(nums)
        while n > 1:
            n //= 2
            for i in range(n):
                op = min if i & 1 == 0 else max
                nums[i] = op(nums[2 * i], nums[2 * i + 1])
        res = nums[0]
        return res
