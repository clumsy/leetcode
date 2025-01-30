class Solution:
    def zigzagTraversal(self, g: List[List[int]]) -> List[int]:
        rs, cs = len(g), len(g[0])
        res, k = [], 0
        for r in range(rs):
            for c in (range(cs) if r & 1 == 0 else reversed(range(cs))):
                if k & 1 == 0:
                    res.append(g[r][c])
                k += 1
        return res
