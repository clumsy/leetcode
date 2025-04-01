class Solution:
    def minCosts(self, c: List[int]) -> List[int]:
        mi = inf
        for i in range(len(c)):
            c[i] = min(mi, c[i])
            mi = c[i]
        res = c
        return res
