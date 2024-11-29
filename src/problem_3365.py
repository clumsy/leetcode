class Solution:
    def isPossibleToRearrange(self, s: str, t: str, k: int) -> bool:
        res, n = False, len(s)
        d, r = divmod(n, k)
        if r == 0:
            cs = Counter([s[i:i + d] for i in range(0, n, d)])
            ct = Counter([t[i:i + d] for i in range(0, n, d)])
            res = cs == ct
        return res
