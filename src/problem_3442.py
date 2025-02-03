class Solution:
    def maxDifference(self, s: str) -> int:
        cnt = Counter(s)
        mi, ma = [inf] * 2, [-inf] * 2
        for v in cnt.values():
            mi[v & 1] = min(mi[v & 1], v)
            ma[v & 1] = max(ma[v & 1], v)
        res = max(ma[1] - mi[0], mi[1] - ma[0])
        return res
