class Solution:
    def countBinarySubstrings(self, s: str) -> int:
        res = b = fst = 0
        n = len(s)
        while b < n:
            e = b
            while e < n and s[b] == s[e]:
                e += 1
            snd = e - b
            res += min(fst, snd)
            fst, b = snd, e
        return res
