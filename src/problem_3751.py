class Solution:
    def totalWaviness(self, n1: int, n2: int) -> int:
        def wvns(x):
            res, x = 0, str(x)
            for i in range(1, len(x) - 1):
                res += (x[i] > max(x[i - 1], x[i + 1])) or (
                    x[i] < min(x[i - 1], x[i + 1])
                )
            return res

        res = sum(wvns(i) for i in range(n1, n2 + 1))
        return res
