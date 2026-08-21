class Solution:
    def internalAngles(self, sides: list[int]) -> list[float]:
        a, b, c = sorted(sides)
        if c >= a + b:
            return []
        p = (a + b + c) / 2
        A = sqrt(p * (p - a) * (p - b) * (p - c))
        # c*h = 2*A
        h = 2 * A / c
        x, y = asin(h / a) * 180 / pi, asin(h / b) * 180 / pi
        res = sorted([x, y, 180 - (x + y)])
        return res
