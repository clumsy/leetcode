# class Solution:
#     def specialNodes(self, n: int, es: List[List[int]], x: int, y: int, z: int) -> int:
#         adj = defaultdict(list)
#         for u, v in es:
#             adj[u].append(v)
#             adj[v].append(u)
#
#         ma_anc = 20
#         anc = [[-1] * ma_anc for i in range(n)]
#         dpt = [-1] * n
#         q = [(0, 0, 0)]
#         while q:
#             p, c, d = q.pop()
#             anc[c][0] = p
#             dpt[c] = d
#             for v in adj[c]:
#                 if v != p:
#                     q.append((c, v, d + 1))
#
#         for v in range(n):
#             for i in range(1, ma_anc):
#                 if anc[v][i - 1] != -1:
#                     anc[v][i] = anc[anc[v][i - 1]][i - 1]
#
#         def dist(u0, v0):
#             if dpt[u0] > dpt[v0]:
#                 u0, v0 = v0, u0
#             u, v = u0, v0
#
#             for i in range(ma_anc - 1, -1, -1):
#                 if dpt[v] - dpt[u] >= 1 << i:
#                     v = anc[v][i]
#
#             if u == v:
#                 return dpt[v0] - dpt[u0]
#
#             for i in range(ma_anc - 1, -1, -1):
#                 if anc[u][i] != anc[v][i]:
#                     u = anc[u][i]
#                     v = anc[v][i]
#
#             return dpt[u0] + dpt[v0] - 2 * dpt[anc[u][i]]
#
#         res = 0
#         for u in range(n):
#             a, b, c = sorted((dist(u, x), dist(u, y), dist(u, z)))
#             res += a * a + b * b == c * c
#         return res


class Solution:
    def specialNodes(self, n: int, es: List[List[int]], x: int, y: int, z: int) -> int:
        adj = defaultdict(list)
        for u, v in es:
            adj[u].append(v)
            adj[v].append(u)

        def bfs(u):
            d, dst = 0, [0] * n
            q = deque([(u, u, 0)])
            while q:
                for _ in range(len(q)):
                    p, c, d = q.popleft()
                    dst[c] = d
                    for v in adj[c]:
                        if v != p:
                            q.append((c, v, d + 1))
                d += 1
            return dst

        dx, dy, dz = bfs(x), bfs(y), bfs(z)

        res = 0
        for u in range(n):
            a, b, c = sorted((dx[u], dy[u], dz[u]))
            res += a * a + b * b == c * c
        return res
