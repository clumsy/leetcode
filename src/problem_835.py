class Solution:
    def largestOverlap(self, img1: List[List[int]], img2: List[List[int]]) -> int:
        n, res = len(img1), 0
        first, second = [], []
        for r in range(n):
            for c in range(n):
                if img1[r][c] == 1:
                    first.append((r, c))
                if img2[r][c] == 1:
                    second.append((r, c))
        cnt_by_off = Counter()
        for x1, y1 in first:
            for x2, y2 in second:
                off = (x1 - x2, y1 - y2)
                # find for which offset combination we have most matches
                cnt_by_off[off] += 1
                res = max(res, cnt_by_off[off])
        return res
