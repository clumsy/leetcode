from math import ceil, sqrt


class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        squares = [i * i for i in range(0, ceil(sqrt(c)) + 1)]
        for i in range(len(squares)):
            j = bisect_left(squares, c - squares[i], lo=i)
            if j < len(squares) and squares[i] + squares[j] == c:
                return True
        return False
