class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        f = t = 0
        res = True
        for b in bills:
            if b == 5:
                f += 1
            elif b == 10:
                if not f:
                    res = False
                    break
                f -= 1
                t += 1
            else:  # b == 20
                if f and t:
                    t -= 1
                    f -= 1
                elif f > 2:
                    f -= 3
                else:
                    res = False
                    break
        return res
