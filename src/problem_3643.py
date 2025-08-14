class Solution:
    def reverseSubmatrix(self, g: List[List[int]], x: int, y: int, k: int) -> List[List[int]]:
        for i in range(k // 2):
            for c in range(y, y + k):
                g[x + i][c], g[x + k - 1 - i][c] = g[x + k - 1 - i][c], g[x + i][c]
        res = g
        return g
