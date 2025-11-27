class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        res = empty = 0
        while numBottles > 0:
            res += numBottles
            numBottles, empty = divmod(numBottles + empty, numExchange)
        return res
