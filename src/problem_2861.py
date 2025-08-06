class Solution:
    def maxNumberOfAlloys(self, n: int, k: int, budget: int, composition: List[List[int]], stock: List[int], cost: List[int]) -> int:
        res = 0
        for i in range(k):
            lo, hi = 0, 10 ** 9
            while lo < hi:
                mi = lo + (hi - lo) // 2
                cur = sum(cost[j] * max(0, mi * composition[i][j] - stock[j]) for j in range(n))
                if cur <= budget:
                    res = max(res, mi)
                    lo = mi + 1
                else:
                    hi = mi
        return res
