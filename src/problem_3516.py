class Solution:
    def findClosest(self, x: int, y: int, z: int) -> int:
        d = abs(z - x) - abs(z - y)
        res = 1 if d < 0 else 2 if d > 0 else 0
        return res
