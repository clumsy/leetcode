class Solution:
    def shiftDistance(self, s: str, t: str, nc: List[int], pc: List[int]) -> int:
        res = 0
        for i in range(1, 26):
            nc[i] += nc[i - 1]
            pc[25 - i] += pc[26 - i]
        for si, ti in zip(s, t):
            if si != ti:
                osi, oti = ord(si) - ord("a"), ord(ti) - ord("a")
                if osi > oti:
                    n = (nc[-1] - nc[osi - 1]) + (nc[oti - 1] if oti else 0)  # [osi; z] + [a; oti)
                    p = pc[oti + 1] - (pc[osi + 1] if osi < 25 else 0)  # (oti; osi]
                else:  # osi < oti
                    n = nc[oti - 1] - (nc[osi - 1] if osi else 0)  # [osi; oti)
                    p = (pc[0] - pc[osi + 1]) + (pc[oti + 1] if oti < 25 else 0)  # [a; osi] + (oti; z]
                res += min(n, p)
        return res
