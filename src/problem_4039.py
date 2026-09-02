class Solution:
    def sumDecoded(self, nums: list[int]) -> int:
        MOD = 10**9 + 7

        def exp(a, b):
            res, i = 1, 0
            while 1 << i <= b:
                if (1 << i) & b == (1 << i):
                    res = (res * a) % MOD
                i += 1
                a = (a * a) % MOD
            return res

        def cnv(v):
            d, w = divmod(v, 10)
            vs = []
            while d:
                d, r = divmod(d, 10)
                vs.append(r)
            x = y = 0
            for i, e in enumerate(vs[::-1]):
                if i < w:
                    x = x * 10 + e
                else:
                    y = y * 10 + e
            return x, y

        res = sum(exp(*cnv(i)) for i in nums) % MOD
        return res
