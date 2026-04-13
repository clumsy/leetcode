class Solution:
    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        off = 1000
        c, res = [0] * (2 * off + 1), 0
        for i in arr2:
            c[i + off] += 1
        for i in range(1, len(c)):
            c[i] += c[i - 1]
        for i in arr1:
            if c[min(i + d, off) + off] - c[max(i - d - 1, -off) + off] == 0:
                res += 1
        return res
