class Solution:
    def hasSameDigits(self, s: str) -> bool:
        s = [int(i) for i in s[::-1]]
        while len(s) > 2:
            s = [(i + j) % 10 for i, j in zip(s[:-1], s[1:])]
        res = s[0] == s[1]
        return res
