# class Solution:
#     def maxSideLength(self, mat: List[List[int]], threshold: int) -> int:
#         rs, cs = (len(mat), len(mat[0]))
#         for r in range(rs):
#             for c in range(cs):
#                 mat[r][c] = mat[r][c] + (mat[r - 1][c] if r > 0 else 0)
#                 mat[r][c] = mat[r][c] + (mat[r][c - 1] if c > 0 else 0)
#                 mat[r][c] = mat[r][c] - (mat[r - 1][c - 1] if r > 0 and c > 0 else 0)
#         res = 0

#         def acc(r, c, s):
#             s = s - 1
#             v = mat[r + s][c + s]
#             v = v - (mat[r + s][c - 1] if c > 0 else 0)
#             v = v - (mat[r - 1][c + s] if r > 0 else 0)
#             v = v + (mat[r - 1][c - 1] if r > 0 and c > 0 else 0)
#             return v

#         for r in range(rs):
#             for c in range(cs):
#                 lo, hi = (res, min(rs - r, cs - c))
#                 while lo < hi:
#                     mi = hi - (hi - lo) // 2
#                     if acc(r, c, mi) > threshold:
#                         hi = mi - 1
#                     else:
#                         lo = mi
#                 res = max(res, hi) if acc(r, c, hi) <= threshold else res
#         return res


class Solution:
    def maxSideLength(self, mat: List[List[int]], threshold: int) -> int:
        rs, cs = (len(mat), len(mat[0]))
        for r in range(rs):
            for c in range(cs):
                mat[r][c] = mat[r][c] + (mat[r - 1][c] if r > 0 else 0)
                mat[r][c] = mat[r][c] + (mat[r][c - 1] if c > 0 else 0)
                mat[r][c] = mat[r][c] - (mat[r - 1][c - 1] if r > 0 and c > 0 else 0)
        res = 0

        def acc(r, c, s):
            if r < 0 or c < 0:
                return threshold + 1
            s = s - 1
            v = mat[r + s][c + s]
            v = v - (mat[r + s][c - 1] if c > 0 else 0)
            v = v - (mat[r - 1][c + s] if r > 0 else 0)
            v = v + (mat[r - 1][c - 1] if r > 0 and c > 0 else 0)
            return v

        for r in range(rs):
            for c in range(cs):
                if acc(r - res, c - res, res + 1) <= threshold:
                    res = res + 1
        return res
