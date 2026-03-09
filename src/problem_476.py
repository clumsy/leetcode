class Solution:
    def findComplement(self, num: int) -> int:
        res, i = 0, 1
        while i <= num:
            res |= i if num & i == 0 else 0
            i <<= 1
        return res
