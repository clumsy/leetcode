class Solution:
    def decimalRepresentation(self, n: int) -> List[int]:
        res, i = [], 1
        while n:
            n, r = divmod(n, 10)
            if r:
                res.append(r * i)
            i *= 10
        res = res[::-1]
        return res
