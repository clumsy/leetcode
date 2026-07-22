class Solution:
    def rearrangeString(self, s: str, x: str, y: str) -> str:
        res, cnt = [], 0
        for c in s:
            if c == x:
                cnt += 1
            else:
                res.append(c)
        res = "".join(res) + x * cnt
        return res
