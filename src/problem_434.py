class Solution:
    def countSegments(self, s: str) -> int:
        res = sum(s[i] != " " for i in range(len(s)) if i == 0 or s[i - 1] == " ")
        return res
