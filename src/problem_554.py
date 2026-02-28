class Solution:
    def leastBricks(self, wall: List[List[int]]) -> int:
        edges = Counter()
        for w in wall:
            e = 0
            for i in w[:-1]:
                e += i
                edges[e] += 1
        res = len(wall) - max(edges.values(), default=0)
        return res
