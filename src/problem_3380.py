class Solution:
    def maxRectangleArea(self, p: List[List[int]]) -> int:
        p.sort()
        res, n = -1, len(p)
        x, y = 0, 1
        for l in range(n - 3):
            if p[l][x] != p[l + 1][x]:
                continue
            for r in range(l + 2, n - 1):
                if p[l][y] <= p[r][y] <= p[l + 1][y]:
                    if p[l][y] == p[r][y] and p[l + 1][y] == p[r + 1][y]:
                        print(p[l], p[l + 1], p[r], p[r + 1])
                        res = max(res, (p[r][x] - p[l][x]) * (p[l + 1][y] - p[l][y]))
                    break
        return res

# class Solution:
#     def maxRectangleArea(self, p: List[List[int]]) -> int:
#         res, n = -1, len(p)
#         x, y = 0, 1
#         for t in range(n):
#             for b in range(n):
#                 if p[t][x] > p[b][x] and p[t][y] > p[b][y]:
#                     tl = br = 0
#                     for k in range(n):
#                         if k == t or k == b:
#                             continue
#                         if p[k][x] == p[b][x] and p[k][y] == p[t][y]:
#                             tl += 1
#                         elif p[k][x] == p[t][x] and p[k][y] == p[b][y]:
#                             br += 1
#                         elif tl > 1 or br > 1 or (p[b][x] <= p[k][x] <= p[t][x] and p[b][y] <= p[k][y] <= p[t][y]):
#                             break
#                     else:
#                         res = max(res, (p[t][x] - p[b][x]) * (p[t][y] - p[b][y])) if tl == br == 1 else res
#         return res
