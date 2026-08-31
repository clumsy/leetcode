class Solution:
    def reverseByType(self, s: str) -> str:
        def process(s, p):
            lo, hi = 0, n - 1
            while lo < hi:
                if not p(s[lo]):
                    lo += 1
                    continue
                if not p(s[hi]):
                    hi -= 1
                    continue
                s[lo], s[hi] = s[hi], s[lo]
                lo += 1
                hi -= 1
            return s

        n, s = len(s), list(s)
        s = process(s, lambda x: x.islower())
        s = process(s, lambda x: not x.isalpha())
        res = "".join(s)
        return res
