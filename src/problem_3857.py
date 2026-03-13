class Solution:
    def minCost(self, n: int) -> int:
        # 5=1+4 | 4
        # 4=1+3 | 3
        # 3=1+2 | 2
        # 2=1+1 | 1
        res = (1 + n - 1) * (n - 1) // 2
        return res
