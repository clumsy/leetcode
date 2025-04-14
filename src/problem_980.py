class Solution:
    def uniquePathsIII(self, grid: List[List[int]]) -> int:
        rs, cs, mp = len(grid), len(grid[0]), {}
        for r in range(rs):
            for c in range(cs):
                if grid[r][c] == 1:
                    x0, y0 = r, c
                elif grid[r][c] == 2:
                    x1, y1 = r, c
                elif grid[r][c] == 0:
                    mp[(r, c)] = len(mp)

        def count(xs, ys, n):
            ps = defaultdict(Counter)
            ps[(xs, ys)][0] = 1
            while n:
                nxt = defaultdict(Counter)
                for (x, y), cnt in ps.items():
                    for dx, dy in [(-1, 0), (+1, 0), (0, -1), (0, +1)]:
                        if 0 <= x + dx < rs and 0 <= y + dy < cs:
                            pnt = (x + dx, y + dy)
                            if pnt in mp:
                                for m, c in cnt.items():
                                    if m & (1 << mp[pnt]) == 0:
                                        nxt[pnt][m | (1 << mp[pnt])] += c
                ps = nxt
                n -= 1
            return ps

        gd = len(mp)
        lft, rgt = count(x0, y0, gd // 2), count(x1, y1, (gd + 1) // 2)
        res, msk = 0, (1 << gd) - 1
        for (x, y), pl in lft.items():
            for dx, dy in [(-1, 0), (+1, 0), (0, -1), (0, +1)]:
                if 0 <= x + dx < rs and 0 <= y + dy < cs:
                    res += sum(rgt[(x + dx, y + dy)][msk ^ p] * c for p, c in pl.items())
        return res
