class Solution:
    def scoreValidator(self, es: list[str]) -> list[int]:
        s = c = 0
        for e in es:
            if c == 10:
                break
            if e == "W":
                c += 1
            elif e in "NB|WD":
                s += 1
            else:
                s += int(e)
        res = [s, c]
        return res
