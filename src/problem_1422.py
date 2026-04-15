class Solution:
    def maxScore(self, s: str) -> int:
        z, o, res = 0, s.count("1"), 0
        for c in s:
            z += c == "0"
            o -= c == "1"
            res = max(res, z + o)
        return res
