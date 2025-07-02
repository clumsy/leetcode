class Solution:
    def maxSumDistinctTriplet(self, x: List[int], y: List[int]) -> int:
        mx = {}
        for x_, y_ in zip(x, y):
            mx[x_] = max(mx.get(x_, 0), y_)
        if len(mx) < 3:
            res = -1
        else:
            m1 = m2 = m3 = -inf
            for i in mx.values():
                if i > m1:
                    m1, m2, m3 = i, m1, m2
                elif i > m2:
                    m2, m3 = i, m2
                elif i > m3:
                    m3 = i
            res = m1 + m2 + m3
        return res
