class Solution:
    def squareIsWhite(self, c: str) -> bool:
        res = ((ord(c[0]) - ord("a")) + (8 - int(c[1]))) & 1 == 0
        return res
