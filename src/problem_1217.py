class Solution:
    def minCostToMoveChips(self, position: List[int]) -> int:
        n = len(position)
        odd = sum(p & 1 == 1 for p in position)
        res = min(odd, n - odd)
        return res
