class Solution:
    def partitionString(self, s: str) -> List[str]:
        pts, cur = {}, ""
        for c in s:
            cur += c
            if cur not in pts:
                pts[cur], cur = True, ""
        res = [i for i in pts]
        return res
# class Solution:
#     def partitionString(self, s: str) -> List[str]:
#         root = cur = {}
#         res, val = [], []
#         for c in s:
#             val.append(c)
#             if c not in cur:
#                 cur[c] = {}
#                 res.append("".join(val))
#                 cur, val = root, []
#             else:
#                 cur = cur[c]
#         return res
