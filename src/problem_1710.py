class Solution:
    def maximumUnits(self, boxTypes: List[List[int]], truckSize: int) -> int:
        def order(i):
            return -i[1]
        boxTypes.sort(key=order)
        res = 0
        for c, u in boxTypes:
            d = min(truckSize, c)
            res += d * u
            truckSize -= d
            if truckSize == 0:
                break
        return res
