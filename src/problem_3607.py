class Solution:
    def processQueries(self, c: int, cs: List[List[int]], qs: List[List[int]]) -> List[int]:
        es = [[] for _ in range(c)]
        for u, v in cs:
            es[u - 1].append(v - 1)
            es[v - 1].append(u - 1)
        c2p = [-1] * c
        for i in range(c):
            if c2p[i] < 0:
                q = [i]
                while q:
                    cur = q.pop()
                    if c2p[cur] >= 0:
                        continue
                    c2p[cur] = i
                    for e in es[cur]:
                        if c2p[e] < 0:
                            q.append(e)
        pg = [[] for _ in range(c)]
        for i in reversed(range(c)):
            pg[c2p[i]].append(i)
        on = [True] * c
        res = []
        for t, x in qs:
            x -= 1
            if t == 2:
                on[x] = False
            elif on[x]:
                res.append(x + 1)
            else:
                p = c2p[x]
                while pg[p] and not on[pg[p][-1]]:
                    pg[p].pop()
                res.append(pg[p][-1] + 1 if pg[p] else -1)
        return res
