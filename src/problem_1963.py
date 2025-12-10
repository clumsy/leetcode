class Solution:
    def minSwaps(self, s: str) -> int:
        lo, hi = 0, len(s) - 1
        res = o = c = 0
        while lo < hi:
            while lo < hi and (o > 0 or s[lo] == "["):
                o += 1 if s[lo] == "[" else -1
                lo += 1
            while lo < hi and (c > 0 or s[hi] == "]"):
                c += 1 if s[hi] == "]" else -1
                hi -= 1
            if lo < hi:
                res += 1
                lo += 1
                hi -= 1
                o += 1
                c += 1
        return res
