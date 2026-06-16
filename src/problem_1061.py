class Solution:
    def smallestEquivalentString(self, s1: str, s2: str, baseStr: str) -> str:
        class UnionFind:
            def __init__(self):
                self.prnt = {c: c for c in string.ascii_lowercase}

            def find(self, c):
                if c != self.prnt[c]:
                    self.prnt[c] = self.find(self.prnt[c])
                return self.prnt[c]

            def union(self, a, b):
                pa, pb = self.find(a), self.find(b)
                if pa != pb:
                    if pa > pb:
                        pa, pb = pb, pa
                    self.prnt[pb] = pa
                return pa

        uf = UnionFind()
        for a, b in zip(s1, s2):
            uf.union(a, b)

        res = "".join(uf.find(c) for c in baseStr)
        return res
