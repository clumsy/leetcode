class Solution:
    def maximizeSquareHoleArea(self, n: int, m: int, h: List[int], v: List[int]) -> int:
        def max_hole(x):
            x.sort()
            cur = ma = 1
            for i in range(1, len(x)):
                if x[i] - x[i - 1] == 1:
                    cur += 1
                else:
                    cur = 1
                ma = max(ma, cur)
            return ma + 1
        res = min(max_hole(v), max_hole(h)) ** 2
        return res
