class Solution:
    def mirrorDistance(self, n: int) -> int:
        res = abs(n - int(str(n)[::-1]))
        return res
