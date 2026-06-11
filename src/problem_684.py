class UnionFind:
    def __init__(self, length):
        self.parent = [i for i in range(length)]
        self.size = [1] * length

    def union(self, x, y):
        parent, size = self.parent, self.size
        px, py = self.find(x), self.find(y)
        if px == py:
            return False
        if size[px] < size[py]:
            x, y = y, x
            px, py = py, px
        size[px] += size[py]
        parent[py] = px
        return True

    def find(self, x):
        parent = self.parent
        if x != parent[x]:
            parent[x] = self.find(parent[x])
        return parent[x]


class Solution:
    def findRedundantConnection(self, edges: List[List[int]]) -> List[int]:
        uf = UnionFind(len(edges) + 1)  # nodes labeled starting from 1
        for x, y in edges:
            if not uf.union(x, y):
                return [x, y]
