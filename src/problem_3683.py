class Solution:
    def earliestTime(self, ts: List[List[int]]) -> int:
        res = min(s + t for s, t in ts)
        return res
