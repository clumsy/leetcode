class Solution:
    def sortVowels(self, s: str) -> str:
        cnt, pos, res = {}, {}, list(s)
        for i, c in enumerate(s):
            if c in "aeiou":
                pos[c] = pos.get(c, i)
                cnt[c] = cnt.get(c, 0) + 1
        vs = sorted(((-k, pos[v], v) for v, k in cnt.items()), reverse=True)
        vs = list("".join(v * -k for k, _, v in vs))
        for i, c in enumerate(res):
            if c in "aeiou":
                res[i] = vs.pop()
        res = "".join(res)
        return res
