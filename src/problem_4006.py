class Solution:
    def countValidPrefixes(self, s: str) -> int:
        res = b = 0
        for c in s:
            b += 1 if c == "0" else -1
            res += -1 <= b <= 1
        return res
