class Solution:
    def minQueenMoves(self, s: list[int], t: list[int]) -> int:
        res = (
            0
            if s == t
            else 1
            if s[0] == t[0]
            or s[1] == t[1]
            or sum(s) == sum(t)
            or s[0] - s[1] == t[0] - t[1]
            else 2
        )
        return res
