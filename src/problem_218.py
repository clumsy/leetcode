class Solution:
    def getSkyline(self, b: List[List[int]]) -> List[List[int]]:
        hs = []
        for l, r, h in b:
            hs.append([l, -h, r])
            hs.append([r, 0, 0])
        hs.sort()
        res, stk = [(0, 0)], [(0, inf)]
        for x, neg_h, r in hs:
            while stk[0][1] <= x:
                heappop(stk)
            if neg_h != 0:
                heappush(stk, (neg_h, r))
            if res[-1][1] != (h := -stk[0][0]):
                res.append((x, h))
        res = res[1:]
        return res

# class Solution:
#     def getSkyline(self, b: List[List[int]]) -> List[List[int]]:
#         hs = []
#         for l, r, h in b:
#             hs.append([l, -h])
#             hs.append([r, h])
#         hs.sort()
#         cnt, res, stk = Counter([0]), [], [0]
#         for x, h in hs:
#             h = -h
#             if h < 0:
#                 cnt[-h] -= 1
#                 while cnt[-stk[0]] == 0:
#                     heappop(stk)
#             else:
#                 cnt[h] += 1
#                 heappush(stk, -h)
#             h = max(h, -stk[0])
#             if not res or (res[-1][0] < x and res[-1][1] != h):
#                 res.append([x, h])
#         return res
