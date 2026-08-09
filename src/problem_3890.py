class Solution:
    def findGoodIntegers(self, n: int) -> list[int]:
        cnt = defaultdict(int)
        ns = [i**3 for i in range(1, int(cbrt(n)) + 1)]
        nn, res = len(ns), []
        for i in range(nn):
            for j in range(i + 1):
                k = ns[i] + ns[j]
                cnt[k] += 1
                if k <= n and cnt[k] == 2:
                    res.append(k)
        res = sorted(res)
        return res
