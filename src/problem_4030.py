class Solution:
    def isPalindromic(self, s: str) -> bool:
        s = "".join(bin(ord(c))[2:].rjust(8, "0") for c in s)
        n = len(s)
        res = s[n // 2 :] == s[: (n + 1) // 2][::-1]
        return res
