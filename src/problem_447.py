class Solution:
    def numberOfBoomerangs(self, p: List[List[int]]) -> int:
        def dist(i, j):
            return sqrt((p[i][0] - p[j][0]) ** 2 + (p[i][1] - p[j][1]) ** 2)

        dist = [Counter(dist(i, j) for j in range(len(p)) if i != j) for i in range(len(p))]
        res = sum(2 * comb(v, 2) for d in dist for v in d.values() if v > 1)
        return res
