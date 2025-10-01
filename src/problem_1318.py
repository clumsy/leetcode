class Solution:
    def minFlips(self, a: int, b: int, c: int) -> int:
        res = 0
        while a or b or c:
            a, ia = divmod(a, 2) if a else (0, 0)
            b, ib = divmod(b, 2) if b else (0, 0)
            c, ic = divmod(c, 2) if c else (0, 0)
            res += 2 if ic == 0 and ia == ib == 1 else 0 if (ia or ib) == ic else 1
        return res
