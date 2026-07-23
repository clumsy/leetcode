class Solution:
    def concatWithReverse(self, nums: list[int]) -> list[int]:
        res = nums + nums[::-1]
        return res
