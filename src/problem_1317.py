class Solution:
    def getNoZeroIntegers(self, n: int) -> List[int]:
        def find(*seq):
            s = ([i, n - i] for i in range(1, n) if "0" not in str(i) and "0" not in str(n - i))
            return next(s, None)
        res = find(9, 99, 999, 9999) or find(1, 11, 111, 1111)
        return res
