# class Solution:
#     def findMinHeightTrees(self, n: int, es: List[List[int]]) -> List[int]:
#         g = defaultdict(list)
#         for u, v in es:
#             g[u].append(v)
#             g[v].append(u)
#         def bfs(beg, par=None):
#             vis = [i == beg for i in range(n)]
#             q, l = deque([beg]), 0
#             while q:
#                 l += 1
#                 for _ in range(len(q)):
#                     p = q.popleft()
#                     for c in g[p]:
#                         if not vis[c]:
#                             vis[c] = True
#                             q.append(c)
#                             if par:
#                                 par[c] = p
#             return p, l
#         beg, _ = bfs(0)
#         end, lgt = bfs(beg, par := [None] * n)
#         for _ in range((lgt - 1) // 2):
#             end = par[end]
#         res = [0] if n == 1 else [end] if lgt & 1 == 1 else [end, par[end]]
#         return res

class Solution:
    def findMinHeightTrees(self, n: int, es: List[List[int]]) -> List[int]:
        g = defaultdict(list)
        inc = [0] * n
        for u, v in es:
            g[u].append(v)
            g[v].append(u)
            inc[v] += 1
            inc[u] += 1
        res = deque([i for i in range(n) if inc[i] < 2])
        while n > 2:
            n -= len(res)
            for _ in range(len(res)):
                i = res.popleft()
                for c in g[i]:
                    inc[c] -= 1
                    if inc[c] == 1:
                        res.append(c)
        res = list(res)
        return res
