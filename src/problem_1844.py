class Solution:
    def replaceDigits(self, s: str) -> str:
        res = [c if i & 1 == 0 else chr(ord(s[i - 1]) + int(c)) for i, c in enumerate(s)]
        res = "".join(res)
        return res
