class Solution:
    def imageSmoother(self, img: List[List[int]]) -> List[List[int]]:
        rows, cols = len(img), len(img[0])
        for r in range(rows):
            for c in range(cols):
                img[r][c] += img[r - 1][c] if r > 0 else 0
                img[r][c] += img[r][c - 1] if c > 0 else 0
                img[r][c] -= img[r - 1][c - 1] if r > 0 and c > 0 else 0
        res = [[0] * cols for _ in range(rows)]
        for r in range(rows):
            for c in range(cols):
                r_, c_ = min(r + 1, rows - 1), min(c + 1, cols - 1)
                res[r][c] = img[r_][c_]
                dr = 3 - (r_ == rows - 1)
                dc = 3 - (c_ == cols - 1)
                res[r][c] -= img[r - 2][c_] if r > 1 else 0
                res[r][c] -= img[r_][c - 2] if c > 1 else 0
                res[r][c] += img[r - 2][c - 2] if r > 1 and c > 1 else 0
                cnt = (r_ - max(-1, r - 2)) * (c_ - max(-1, c - 2))
                res[r][c] //= cnt
        return res
