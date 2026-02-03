class Solution:
    def vowelConsonantScore(self, s: str) -> int:
        v = sum(c in "aeiou" for c in s)
        c = sum(c in ascii_lowercase for c in s) - v
        n = len(s)
        res = 0 if c == 0 else v // c
        return res
