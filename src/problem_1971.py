class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        inc = defaultdict(list)
        for s, e in edges:
            inc[e].append(s)
            inc[s].append(e)
        to_visit = [True] * n
        q = deque([source])
        res = False
        while q:
            cur = q.popleft()
            if cur == destination:
                res = True
                break
            for e in inc[cur]:
                if to_visit[e]:
                    q.append(e)
                    to_visit[e] = False
        return res
