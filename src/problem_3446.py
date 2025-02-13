class Solution:
    def sortMatrix(self, g: List[List[int]]) -> List[List[int]]:
        rs, cs = len(g), len(g[0])
        for r in range(rs):
            h = []
            for c in range(cs - r):
                heappush(h, -g[r + c][c])
            for c in range(cs - r):
                g[r + c][c] = -heappop(h)
        for c in range(1, cs):
            h = []
            for r in range(rs - c):
                heappush(h, g[r][c + r])
            for r in range(rs - c):
                g[r][c + r] = heappop(h)
        res = g
        return res
