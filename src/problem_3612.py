class Solution:
    def processStr(self, s: str) -> str:
        res = []
        for c in s:
            if c == "*":
                if res:
                    res.pop()
            elif c == "#":
                res.extend(res)
            elif c == "%":
                res.reverse()
            else:
                res.append(c)
        res = "".join(res)
        return res
