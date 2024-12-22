class Solution:
    def passThePillow(self, n: int, time: int) -> int:
        d, r = divmod(time, n - 1)
        res = r + 1 if d & 1 == 0 else n - r
        return res
