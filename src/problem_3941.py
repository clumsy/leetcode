class Solution:
    def passwordStrength(self, ps: str) -> int:
        res = 0
        for c in set(ps):
            if "a" <= c <= "z":
                res += 1
            elif "A" <= c <= "Z":
                res += 2
            elif "0" <= c <= "9":
                res += 3
            else:
                res += 5
        return res
