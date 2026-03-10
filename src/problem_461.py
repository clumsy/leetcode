class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        res, m = 0, 1
        while m <= max(x, y):
            res += x & m != y & m
            m <<= 1
        return res
