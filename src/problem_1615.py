class Solution:
    def maximalNetworkRank(self, n: int, roads: List[List[int]]) -> int:
        ctd = [[0] * n for _ in range(n)]
        for i, j in roads:
            ctd[i][i] += 1
            ctd[j][j] += 1
            ctd[i][j] = ctd[j][i] = 1
        res = 0
        for i in range(n - 1):
            for j in range(i + 1, n):
                res = max(res, ctd[i][i] + ctd[j][j] - ctd[i][j])
        return res
