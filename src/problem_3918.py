class Solution:
    def sumOfPrimesInRange(self, n: int) -> int:
        r = int(str(n)[::-1])
        lo, hi = min(n, r), max(n, r)
        ps = [i > 1 and (i & 1 == 1 or 1 < i < 4) for i in range(hi + 1)]
        for i in range(3, int(len(ps) ** 0.5) + 1, 2):
            if ps[i]:
                for j in range(i * i, len(ps), i):
                    ps[j] = False
        res = sum(i for i in range(lo, hi + 1) if ps[i])
        return res
