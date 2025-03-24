class Solution:
    def scoreOfParentheses(self, s: str) -> int:
        res, d, i, n = 0, 0, 0, len(s)
        while i < n:
            while i < n and s[i] == "(":
                d += 1
                i += 1
            res += 1 << (d - 1)
            while i < n and s[i] == ")":
                d -= 1
                i += 1
        return res
