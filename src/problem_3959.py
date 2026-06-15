class Solution:
    def checkGoodInteger(self, n: int) -> bool:
        res = sum(d**2 - d for d in (int(c) for c in str(n))) >= 50
        return res
