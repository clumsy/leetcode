class Solution:
    def countArrays(self, o: List[int], b: List[List[int]]) -> int:
        for i, (u, v) in enumerate(b):
            if i:
                d = o[i] - o[i - 1]
                lo, hi = max(lo + d, u), min(hi + d, v)
            else:
                lo, hi = u, v
        res = max(0, hi - lo + 1)
        return res
