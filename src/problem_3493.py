class Solution:
    def numberOfComponents(self, ps: List[List[int]], k: int) -> int:
        vis = set()
        def dfs(i):
            vis.add(i)
            for j, p in enumerate(ps):
                if i != j and j not in vis and len(set(ps[i]) & set(p)) >= k:
                    dfs(j)
            return 1
        res = sum(i not in vis and dfs(i) for i in range(len(ps)))
        return res
# class Solution:
#     def numberOfComponents(self, ps: List[List[int]], k: int) -> int:
#         n = len(ps)
#         prnt = [i for i in range(n)]
#         def find(i):
#             if prnt[i] == i:
#                 return i
#             prnt[i] = find(prnt[i])
#             return prnt[i]
#         cnt = [[0] * 101 for _ in range(n)]
#         for i in range(n):
#             for v in ps[i]:
#                 cnt[i][v] += 1
#             for j in range(i):
#                 if sum(1 for v in range(101) if cnt[i][v] and cnt[j][v]) >= k:
#                     prnt[find(j)] = find(i)
#         res = sum(find(i) == i for i in range(n))
#         return res
