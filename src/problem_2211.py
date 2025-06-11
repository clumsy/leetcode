class Solution:
    def countCollisions(self, d: str) -> int:
        res = r = l = s = 0
        for c in d:
            if c in "LS":
                if r > 0:
                    res += r + (c == "L")
                    r, s = 0, 1
                else:
                    if c == "L":
                        l += 1
                    else:
                        res += l if s else 0
                        l, s = 0, 1
            else:
                r += 1
                res += l if s else 0
                l = s = 0
        res += l if s else 0
        return res
