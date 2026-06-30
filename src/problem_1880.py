class Solution:
    def isSumEqual(self, f: str, s: str, t: str) -> bool:
        def num(p):
            return int("".join(str(ord(c) - ord("a")) for c in p))

        res = num(f) + num(s) == num(t)
        return res
