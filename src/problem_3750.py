class Solution:
    def minimumFlips(self, n: int) -> int:
        s = bin(n)[2:].lstrip("0")
        res = (n ^ int(s[::-1], 2)).bit_count()
        return res
