# class Solution:
#     def countArrangement(self, n: int) -> int:
#         def solve(used, i=1):
#             if i == n + 1:
#                 return 1
#             res = 0
#             for pi in range(1, n + 1):
#                 if pi not in used and (pi % i == 0 or i % pi == 0):
#                     used.add(pi)
#                     res = res + solve(used, i + 1)
#                     used.remove(pi)
#             return res
#         res = solve(set())
#         return res


class Solution:
    def countArrangement(self, n: int) -> int:
        bitset_size = 2**n
        dp = [[0] * bitset_size for _ in range(n + 1)]
        dp[0][0] = 1
        for i in range(1, n + 1):
            for b in range(bitset_size):
                for x in range(n):
                    if b & 1 << x and (i % (x + 1) == 0 or (x + 1) % i == 0):
                        dp[i][b] = dp[i][b] + dp[i - 1][b ^ 1 << x]
        res = dp[-1][-1]
        return res
