class Solution:
    def calculateMinimumHP(self, d: List[List[int]]) -> int:
        rs, cs = len(d), len(d[0])
        dp = [[inf] * (cs + 1) for _ in range(rs + 1)]
        dp[rs][cs - 1] = dp[rs - 1][cs] = 1
        for r in reversed(range(rs)):
            for c in reversed(range(cs)):
                dp[r][c] = max(1, min(dp[r + 1][c], dp[r][c + 1]) - d[r][c])
        res = dp[0][0]
        return res

# class Solution:
#     def calculateMinimumHP(self, d: List[List[int]]) -> int:
#         rs, cs = len(d), len(d[0])
#         def check(i):
#             d_ = [[-inf] * cs for _ in range(rs)]
#             d_[0][0] = i + d[0][0]
#             for r in range(rs):
#                 for c in range(cs):
#                     if r or c:
#                         d_[r][c] = max(d_[r - 1][c] if r and d_[r - 1][c] > 0 else -inf, d_[r][c - 1] if c and d_[r][c - 1] > 0 else -inf) + d[r][c]
#         return res
