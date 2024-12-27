class Solution:
    def maxSpending(self, vals: List[List[int]]) -> int:
        q = [(v.pop(), i) for i, v in enumerate(vals)]
        heapify(q)
        res, d = 0, 1
        while q:
            v, i = heappop(q)
            res += v * d
            d += 1
            if vals[i]:
                heappush(q, (vals[i].pop(), i))
        return res
