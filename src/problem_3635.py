class Solution:
    def earliestFinishTime(
        self, ls: List[int], ld: List[int], ws: List[int], wd: List[int]
    ) -> int:
        lf = min(ls[i] + ld[i] for i in range(len(ls)))
        wf = min(ws[i] + wd[i] for i in range(len(ws)))
        lff = lf + min(
            ws[i] + wd[i] - lf if ws[i] >= lf else wd[i] for i in range(len(ws))
        )
        wff = wf + min(
            ls[i] + ld[i] - wf if ls[i] >= wf else ld[i] for i in range(len(ls))
        )
        res = min(lff, wff)
        return res
