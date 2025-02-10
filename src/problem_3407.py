class Solution:
    def hasMatch(self, s: str, p: str) -> bool:
        p = p.split("*")
        i = s.find(p[0])
        res = False
        if i >= 0:
            res = s.find(p[1], i + len(p[0])) >= 0
        return res
