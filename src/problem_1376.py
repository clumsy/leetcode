class Solution:
    def numOfMinutes(self, n: int, headID: int, manager: List[int], informTime: List[int]) -> int:
        subs = defaultdict(list)
        for i, m in enumerate(manager):
            subs[m].append(i)

        def dfs(node, s=0):
            if node not in subs:
                return 0
            return s + informTime[node] + max(dfs(s) for s in subs[node])

        res = dfs(headID)
        return res
