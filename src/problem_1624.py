class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        res, frst = -1, {}
        for i, c in enumerate(s):
            f = frst.get(c, None)
            if f is not None:
                res = max(res, i - f - 1)
            else:
                frst[c] = i
        return res
