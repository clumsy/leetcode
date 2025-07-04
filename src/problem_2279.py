class Solution:
    def maximumBags(self, capacity: List[int], rocks: List[int], k: int) -> int:
        h, n = [], len(rocks)
        for i in range(n):
            heappush(h, (capacity[i] - rocks[i], i))
        res = 0
        while h and k >= 0:
            diff, i = heappop(h)
            res += k >= diff
            k -= diff
        return res
