class Solution:
    def mirrorFrequency(self, s: str) -> int:
        res, cnt = 0, Counter(s)
        for c in cnt:
            lst, fst = ("9", "0") if c.isdigit() else ("z", "a")
            m = chr(ord(lst) - (ord(c) - ord(fst)))
            if m not in cnt or c <= m:
                res += abs(cnt[c] - cnt[m])
        return res
