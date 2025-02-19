class Solution:
    def makeSmallestPalindrome(self, s: str) -> str:
        s, n = list(s), len(s)
        for i in range(n // 2):
            s[i] = s[n - 1 - i] = min(s[i], s[n - 1 - i])
        res = "".join(s)
        return res
