class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n, m = len(matrix), len(matrix[0])
        lo, hi = 0, n * m - 1  # flatten
        while lo < hi:
            mi = lo + (hi - lo) // 2
            diff = matrix[mi // m][mi % m] - target
            if diff == 0:
                return True
            if diff > 0:
                hi = mi
            else:
                lo = mi + 1
        return False
