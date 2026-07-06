class Solution:
    def arraySign(self, nums: List[int]) -> int:
        res = 1
        for num in nums:
            if num == 0:
                res = 0
                break
            res *= 1 if num > 0 else -1
        return res
