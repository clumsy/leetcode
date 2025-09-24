class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        res, base = 0, ord("A") - 1
        for c in columnTitle:
            res = res * 26 + (ord(c) - base)
        return res
