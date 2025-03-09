class Solution:
    def maxSum(self, g: List[List[int]], ls: List[int], k: int) -> int:
        n, h = len(g), []
        for r in range(n):
            h.extend(nlargest(min(k, ls[r]), g[r]))
        res = sum(nlargest(k, h))
        return res
