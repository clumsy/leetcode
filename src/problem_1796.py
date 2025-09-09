class Solution:
    def secondHighest(self, s: str) -> int:
        ma1 = ma2 = -1
        for c in s:
            if c.isdigit():
                c = int(c)
                if c > ma1:
                    ma1, ma2 = c, ma1
                elif ma1 > c > ma2:
                    ma2 = c
        res = ma2
        return res
