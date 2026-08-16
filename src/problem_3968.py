class Solution:
    def maxDistance(self, ms: str) -> int:
        s = x = y = 0
        for m in ms:
            x += -1 if m == "L" else 1 if m == "R" else 0
            y += -1 if m == "D" else 1 if m == "U" else 0
            s += m == "_"
        res = abs(x) + s + abs(y)
        return res
