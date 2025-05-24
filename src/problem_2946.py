class Solution:
    def areSimilar(self, mat: List[List[int]], k: int) -> bool:
        m, n = len(mat), len(mat[0])
        k %= n
        res = True
        for r in range(m):
            for c in range(n):
                if mat[r][c] != (mat[r][(c - k) % n] if c & 1 == 0 else mat[r][(c + k) % n]):
                    res = False
        return res
