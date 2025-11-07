class Solution:
    def evaluate(self, s: str, knowledge: List[List[str]]) -> str:
        res, e, m = [], 0, {k: v for k, v in knowledge}
        for i, c in enumerate(s):
            if c == "(":
                res.append(s[e:i])
                b = i + 1
            elif c == ")":
                name = s[b:i]
                res.append(m.get(name, "?"))
                e = i + 1
        res.append(s[e:])
        res = "".join(res)
        return res
