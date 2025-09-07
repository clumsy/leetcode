class Solution:
    def highestPeak(self, isWater: List[List[int]]) -> List[List[int]]:
        m, n = len(isWater), len(isWater[0])
        q = deque([(r, c) for r in range(m) for c in range(n) if isWater[r][c]])
        res, h = [[None] * n for _ in range(m)], 0
        while q:
            for _ in range(len(q)):
                r, c = q.popleft()
                if res[r][c] is not None:
                    continue
                res[r][c] = h
                for dr, dc in [(-1, 0), (+1, 0), (0, -1), (0, +1)]:
                    if 0 <= r + dr < m and 0 <= c + dc < n:
                        q.append((r + dr, c + dc))
            h += 1
        return res
