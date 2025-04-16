class Solution:
    def mincostTickets(self, days: List[int], costs: List[int]) -> int:
        (res, last7, last30) = (0, deque(), deque())
        for d in days:
            while last7 and d - last7[0][0] >= 7:
                last7.popleft()
            last7.append((d, res + costs[1]))
            while last30 and d - last30[0][0] >= 30:
                last30.popleft()
            last30.append((d, res + costs[2]))
            res = min(res + costs[0], last7[0][1], last30[0][1])
        return res

# class Solution:
#     def mincostTickets(self, days: List[int], costs: List[int]) -> int:
#         travel = set(days)
#         dp = [0] * (days[-1] + 1)
#         for i in range(1, len(dp)):
#             dp[i] = min((dp[max(0, i - d)] + c for (d, c) in zip([1, 7, 30], costs))) if i in travel else dp[max(0, i - 1)]
#         res = dp[days[-1]]
#         return res
