class Solution:
    def maximumNumberOfStringPairs(self, words: List[str]) -> int:
        res, m = 0, set(w[::-1] for w in words)
        for w in words:
            rev = w[::-1]
            res += w != rev and w in m
        res //= 2
        return res
