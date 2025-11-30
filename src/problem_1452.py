class Solution:
    def peopleIndexes(self, fc: List[List[str]]) -> List[int]:
        m = {}
        for f in fc:
            for c in f:
                m[c] = m.get(c, len(m))
        n = len(fc)
        masks = [None] * n
        for i, f in enumerate(fc):
            cur = 0
            for c in f:
                cur |= 1 << m[c]
            masks[i] = cur
        res = []
        for i in range(n):
            for j in range(n):
                if i != j and masks[j] & masks[i] == masks[i]:
                    break
            else:
                res.append(i)
        return res
