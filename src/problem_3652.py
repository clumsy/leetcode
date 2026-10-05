class Solution:
    def maxProfit(self, ps: List[int], ss: List[int], k: int) -> int:
        n = len(ps)
        res = sum(ss[i] * ps[i] for i in range(n))
        cur = (
            res
            + sum(-ss[i] * ps[i] for i in range(k // 2))
            + sum((1 - ss[i]) * ps[i] for i in range(k // 2, k))
        )
        res = max(res, cur)
        for i in range(k, n):
            cur += ss[i - k] * ps[i - k] - ps[i - k // 2] + (1 - ss[i]) * ps[i]
            res = max(res, cur)
        return res
