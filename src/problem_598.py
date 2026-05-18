class Solution:
    def maxCount(self, m: int, n: int, ops: List[List[int]]) -> int:
        mi_a, mi_b = m, n
        for a, b in ops:
            mi_a, mi_b = min(mi_a, a), min(mi_b, b)
        res = mi_a * mi_b
        return res
