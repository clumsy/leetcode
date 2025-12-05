class Solution:
    def restoreArray(self, adjacentPairs: List[List[int]]) -> List[int]:
        res = []
        adj = defaultdict(list)
        for u, v in adjacentPairs:
            adj[u].append(v)
            adj[v].append(u)
        visited = {v: False for v in adj}
        start = next(v for v in adj if len(adj[v]) == 1)

        def dfs(v):
            res.append(v)
            visited[v] = True
            for u in adj[v]:
                if not visited[u]:
                    dfs(u)

        dfs(start)
        return res
