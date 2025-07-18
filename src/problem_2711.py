class Solution:
    def differenceOfDistinctValues(self, grid: List[List[int]]) -> List[List[int]]:
        tl, br = defaultdict(Counter), defaultdict(Counter)
        rs, cs = len(grid), len(grid[0])
        for r in range(rs):
            for c in range(cs):
                br[r - c][grid[r][c]] += 1
        res = [[0] * cs for _ in range(rs)]
        for r in range(rs):
            for c in range(cs):
                br[r - c][grid[r][c]] -= 1
                res[r][c] = abs(sum(v > 0 for v in tl[r - c].values()) - sum(v > 0 for v in br[r - c].values()))
                tl[r - c][grid[r][c]] += 1
        return res
