class Solution:
    def minPenalty(self, p: int, ls: list[int], at: list[int]) -> int:
        m = max(ls)
        res = max(p - (at[i] % p) if at[i] % p >= m else 0 for i in range(len(at)))
        return res
