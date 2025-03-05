class Solution:
    def digArtifacts(self, n: int, artifacts: List[List[int]], dig: List[List[int]]) -> int:
        g = [[0] * n for _ in range(n)]
        for r, c in dig:
            g[r][c] = 1
        for r in range(n):
            for c in range(n):
                g[r][c] += (g[r - 1][c] if r else 0) + (g[r][c - 1] if c else 0) - (g[r - 1][c - 1] if r and c else 0)
        res = 0
        for tr, tc, br, bc in artifacts:
            cnt = g[br][bc] - (g[tr - 1][bc] if tr else 0) - (g[br][tc - 1] if tc else 0) + (g[tr - 1][tc - 1] if tr and tc else 0)
            res += (br - tr + 1) * (bc - tc + 1) == cnt
        return res
