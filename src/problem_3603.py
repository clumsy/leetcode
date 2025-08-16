# class Solution:
#     def minCost(self, m: int, n: int, wc: List[List[int]]) -> int:
#         dp = [[[inf] * 2 for _ in range(n)] for _ in range(m)]
#         dp[0][0][1] = 1
#         q = [(1, 0, 0)]
#         while q:
#             v, r, c = heappop(q)
#             if dp[r][c][0] < v or (r == m - 1 and c == n - 1):
#                 continue
#             if dp[r][c][0] + wc[r][c] < dp[r][c][1]:
#                 dp[r][c][1] = dp[r][c][0] + wc[r][c]
#             for dr, dc in ((1, 0), (0, 1)):
#                 r_, c_ = r + dr, c + dc
#                 if 0 <= r_ < m and 0 <= c_ < n:
#                     ec = (r_ + 1) * (c_ + 1)
#                     if dp[r][c][1] + ec < dp[r_][c_][0]:
#                         dp[r_][c_][0] = dp[r][c][1] + ec
#                         heappush(q, (dp[r_][c_][0], r_, c_))
#         res = min(dp[-1][-1])
#         return res

class Solution:
    def minCost(self, m: int, n: int, wc: List[List[int]]) -> int:
        wc[0][0] = wc[-1][-1] = 0
        for r in range(m):
            for c in range(n):
                prv = 0 if r == 0 and c == 0 else inf
                prv = min(prv, wc[r - 1][c]) if r else prv
                prv = min(prv, wc[r][c - 1]) if c else prv
                wc[r][c] += (r + 1) * (c + 1) + prv
        res = wc[-1][-1]
        return res
