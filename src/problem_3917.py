class Solution:
    def countOppositeParity(self, nums: list[int]) -> list[int]:
        e = o = 0
        n = len(nums)
        res = [0] * n
        for i in reversed(range(n)):
            res[i] = o if nums[i] & 1 == 0 else e
            e += nums[i] & 1 == 0
            o += nums[i] & 1 == 1
        return res
