class Solution:
    def numDifferentIntegers(self, s: str) -> int:
        res, n, p = set(), len(s), 0
        for i in range(n):
            if s[i].isalpha():
                if i > p:
                    res.add(int(s[p:i]))
                p = i + 1
        if n > p:
            res.add(int(s[p:]))
        res = len(res)
        return res
