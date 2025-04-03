class Solution:
    def spiralMatrixIII(self, rows: int, cols: int, r: int, c: int) -> List[List[int]]:
        res = [[r, c]]
        d = [
            [0, 1],
            [1, 0],
            [0, -1],
            [-1, 0],
        ]
        l, k = 1, 0
        while len(res) < rows * cols:
            for _ in range(2):
                for _ in range(1, l + 1):
                    r, c = r + d[k][0], c + d[k][1]
                    if 0 <= r < rows and 0 <= c < cols:
                        res.append([r, c])
                k = (k + 1) % len(d)
            l += 1
        return res
