class Solution:
    def maxProfitAssignment(self, difficulty: List[int], profit: List[int], worker: List[int]) -> int:
        jobs = sorted(zip(difficulty, profit))
        res, m, i, n = (0, 0, 0, len(profit))
        for w in sorted(worker):
            while i < n and w >= jobs[i][0]:
                m = max(m, jobs[i][1])
                i = i + 1
            res = res + m
        return res

# class Solution:
#     def maxProfitAssignment(self, difficulty: List[int], profit: List[int], worker: List[int]) -> int:
#         n, res, m = (len(profit), 0, 0)
#         d = sorted(([difficulty[i], profit[i]] for i in range(n)))
#         for i in d:
#             m = max(m, i[1])
#             i[1] = m
#         for w in worker:
#             i = bisect_right(d, [w + 1]) - 1
#             res = res + (0 if i < 0 else d[i][1])
#         return res
