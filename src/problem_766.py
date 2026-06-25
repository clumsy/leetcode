class Solution:
    def isToeplitzMatrix(self, mat: List[List[int]]) -> bool:
        m, n = len(mat), len(mat[0])
        for r in range(1, m):
            for c in range(1, n):
                if mat[r][c] != mat[r - 1][c - 1]:
                    return False
        return True
