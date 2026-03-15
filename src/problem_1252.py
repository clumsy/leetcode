class Solution:
    def oddCells(self, m: int, n: int, indices: List[List[int]]) -> int:
        cs, rs = defaultdict(int), defaultdict(int)
        for r, c in indices:
            rs[r] += 1
            cs[c] += 1
        res = sum((rs[r] + cs[c]) & 1 == 1 for r in range(m) for c in range(n))
        return res
