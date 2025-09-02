class Solution:
    def rotatedDigits(self, n: int) -> int:
        def valid(x):
            changed = bad = False
            while x:
                x, d = divmod(x, 10)
                changed |= d in {2, 5, 6, 9}
                bad |= d in {3, 4, 7}
            return changed and not bad
        res = sum(valid(i + 1) for i in range(n))
        return res
