class Solution:
    def maximumScore(self, a: int, b: int, c: int) -> int:
        a, b, c = sorted([a, b, c])
        res = 0
        # a = (c - b) + 2*x
        x = (a - c + b) // 2
        res = 2 * x + (c - b) + b - x if x > 0 else a + min(b, c - a)
        return res
