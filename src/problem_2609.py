class Solution:
    def findTheLongestBalancedSubstring(self, s: str) -> int:
        n, i, res = len(s), 0, 0
        while i < n:
            z = 0
            while i + z < n and s[i + z] == "0":
                z += 1
            i += z
            o = 0
            while i + o < n and s[i + o] == "1":
                o += 1
            res = max(res, 2 * min(z, o))
            i += o
        return res
