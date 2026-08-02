class Solution:
    def minEnergy(self, n: int, bs: int, ins: list[list[int]]) -> int:
        ins.sort()
        t = 0
        s, e = ins[0]
        for u, v in ins[1:]:
            if u <= e + 1:
                e = max(e, v)
            else:
                t += e - s + 1
                s, e = u, v
        t += e - s + 1
        res = (bs + 2) // 3 * t
        return res
