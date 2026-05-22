class Solution:
    def findDuplicate(self, paths: List[str]) -> List[List[str]]:
        m = defaultdict(list)
        for p in paths:
            d, *fs = p.split()
            for f in fs:
                n, c = f.split("(")
                m[c[:-1]].append(f"{d}/{n}")
        res = [v for v in m.values() if len(v) > 1]
        return res
