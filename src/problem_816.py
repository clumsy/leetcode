class Solution:
    def ambiguousCoordinates(self, s: str) -> List[str]:
        def variants(p):
            res, n = [], len(p)
            for i in range(n):
                l, r = p[:i], p[i:]
                if i > 0:
                    if (l == "0" or l[0] != "0") and r[-1] != "0":
                        res.append(f"{l}.{r}")
                elif r == "0" or r[0] != "0":
                    res.append(r)
            return res
        res, s = [], s[1:-1]
        for i in range(1, len(s)):
            vs = (f"({x}, {y})" for x in variants(s[:i]) for y in variants(s[i:]))
            res.extend(vs)
        return res
