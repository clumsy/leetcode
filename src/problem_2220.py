class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        x, res = start ^ goal, 0
        while x:
            res += 1
            x -= x & -x
        return res
