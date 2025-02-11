class Solution:
    def firstCompleteIndex(self, arr: List[int], mat: List[List[int]]) -> int:
        m, n = len(mat), len(mat[0])
        ord = {e: i for i, e in enumerate(arr)}
        for r in range(m):
            for c in range(n):
                mat[r][c] = ord[mat[r][c]]
        res = inf
        for r in range(m):
            res = min(res, max(mat[r]))
        for c in range(n):
            res = min(res, max(mat[i][c] for i in range(m)))
        return res
