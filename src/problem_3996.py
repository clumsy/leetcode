class Solution:
    def canReach(self, s: list[int], t: list[int]) -> bool:
        res = (sum(s) & 1) == (sum(t) & 1)  # parity
        return res
