class Solution:
    def validDigit(self, n: int, x: int) -> bool:
        res = False
        while n > 9:
            n, r = divmod(n, 10)
            res |= r == x
        res = res and n != x
        return res
