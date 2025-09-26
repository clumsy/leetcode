class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        def soldiers(line):
            lo, hi = (0, len(line))
            while lo < hi:
                mi = lo + (hi - lo) // 2
                if line[mi] == 0:
                    hi = mi
                else:
                    lo = mi + 1
            return lo
        h = []
        for i, line in enumerate(_mat):
            heappush(h, (-soldiers(line), -i))
            if len(h) > k:
                heappop(h)
        res = []
        while h:
            res.append(-heappop(h)[1])
        return reversed(res)
