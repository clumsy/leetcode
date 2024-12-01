class Solution:
    def smallestNumber(self, n: int) -> int:
        res = i = 0
        while n:
            res |= 1 << i
            i += 1
            n >>= 1
        return res
