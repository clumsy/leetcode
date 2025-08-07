class Solution:
    def earliestFinishTime(self, ls: List[int], ld: List[int], ws: List[int], wd: List[int]) -> int:
        l_mi = min(s + d for s, d in zip(ls, ld))
        lw_mi = min(max(l_mi, s) + d for s, d in zip(ws, wd))
        w_mi = min(s + d for s, d in zip(ws, wd))
        wl_mi = min(max(w_mi, s) + d for s, d in zip(ls, ld))
        res = min(lw_mi, wl_mi)
        return res
