# class Solution:
#     def minExtraChar(self, s: str, d: List[str]) -> int:
#         @cache
#         def solve(s, d):
#             res = len(s)
#             for i in range(len(s)):
#                 for w in d:
#                     if s.startswith(w, i):
#                         res = min(res, i + solve(s[i + len(w):], d))
#             return res
#         res = solve(s, frozenset(d))
#         return res

class Solution:
    def minExtraChar(self, s: str, d: List[str]) -> int:
        n = len(s)
        dp = [0] * (n + 1)
        for e in range(1, n + 1):
            dp[e] = dp[e - 1] + 1
            for w in d:
                if s[:e].endswith(w):
                    dp[e] = min(dp[e], dp[e - len(w)])
        res = dp[-1]
        return res
