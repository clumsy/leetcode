class Solution:
    def minimumOperations(self, g: List[List[int]]) -> int:
        rs, cs = len(g), len(g[0])
        res = 0
        for c in range(cs):
            cur = g[0][c]
            for r in range(1, rs):
                cur = max(cur + 1, g[r][c])
                res += max(0, cur - g[r][c])
        return res
