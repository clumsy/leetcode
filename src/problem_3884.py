class Solution:
    def firstMatchingIndex(self, s: str) -> int:
        n = len(s)
        for i in range(n // 2 + 1):
            if s[i] == s[n - i - 1]:
                res = i
                break
        else:
            res = -1
        return res
