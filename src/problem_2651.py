class Solution:
    def findDelayedArrivalTime(self, a: int, d: int) -> int:
        res = (a + d) % 24
        return res
