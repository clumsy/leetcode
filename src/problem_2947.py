class Solution:
    def beautifulSubstrings(self, s: str, k: int) -> int:
        n = len(s)
        vwls, cons = [0] * (n + 1), [0] * (n + 1)
        for i in range(1, n + 1):
            cons[i] = cons[i - 1]
            vwls[i] = vwls[i - 1]
            (vwls if s[i - 1] in "aeiou" else cons)[i] += 1
        res = 0
        for i in range(1, n + 1):
            for j in range(i, n + 1):
                c = cons[j] - cons[i - 1]
                v = vwls[j] - vwls[i - 1]
                res += c == v and (c * v) % k == 0
        return res
