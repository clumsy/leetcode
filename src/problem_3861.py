class Solution:
    def minimumIndex(self, cs: list[int], s: int) -> int:
        res, mc = -1, inf
        for i, c in enumerate(cs):
            if c - s >= 0 and c < mc:
                res, mc = i, c
        return res
