class Solution:
    def minTime(self, n: int, edges: List[List[int]], hasApple: List[bool]) -> int:
        inc = [[] for _ in range(n)]
        for i, j in edges:
            inc[i].append(j)
            inc[j].append(i)
        def dfs(k, p=None):
            d = sum(dfs(c, k) for c in inc[k] if c != p)
            return d + 2 * (k > 0) if d > 0 or hasApple[k] else 0
        res = dfs(0)
        return res
