class Solution:
    def maxContainers(self, n: int, w: int, mw: int) -> int:
        res = min(n * n, mw // w)
        return res
