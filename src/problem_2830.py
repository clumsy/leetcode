class Solution:
    def maximizeTheProfit(self, n: int, offers: List[List[int]]) -> int:
        dp = [0] * (n + 1)
        m = defaultdict(list)
        for s, e, g in offers:
            m[e].append((s, g))
        for e in range(1, n + 1):
            dp[e] = dp[e - 1]
            for s, g in m[e - 1]:
                dp[e] = max(dp[e], dp[s] + g)
        res = dp[-1]
        return res

# class Solution:
#     def maximizeTheProfit(self, n: int, offers: List[List[int]]) -> int:
#         offers.sort(key=lambda o: (o[1], -o[2]))
#         dp, res = [], 0
#         for s, e, g in offers:
#             i = bisect_left(dp, (s, 0))
#             res = max(res, (dp[i - 1][1] if i > 0 else 0) + g)
#             dp.append((e, res))
#         return res
