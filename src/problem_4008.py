# class Solution:
#     def minInitialStrength(self, ms: list[int], bs: list[list[int]]) -> int:
#         bs = sorted((a for l, r, v in bs for a in ((l, v), (r + 1, -v))), reverse=True)
#         res = cs = cb = 0
#         for i, m in enumerate(ms):
#             while bs and bs[-1][0] <= i:
#                 cb += bs.pop()[1]
#             res = max(res, cs + m - cb) if m > cb else res
#             cs += m
#         return res


class Solution:
    def minInitialStrength(self, ms: list[int], bs: list[list[int]]) -> int:
        m = len(ms)
        cb = [0] * m
        for l, r, v in bs:
            cb[r] += v
            if l:
                cb[l - 1] -= v
        res = cs = 0
        for i in reversed(range(m)):
            cs += cb[i]
            if res:
                res += ms[i]
            else:
                res = max(0, ms[i] - cs)
        return res
