class Solution:
    def addOperators(self, num: str, tgt: int) -> List[str]:
        res = []
        def solve(num, acc=0, pfx="", prd=0):
            if not num:
                if acc == tgt:
                    res.append(pfx)
                return
            for i in range(1, len(num) + 1):
                if i > 1 and num[0] == "0":
                    break
                part = num[:i]
                val = int(part)
                if not pfx:
                    solve(num[i:], val, part, val)
                else:
                    solve(num[i:], acc + val, f"{pfx}+{part}", val)
                    solve(num[i:], acc - val, f"{pfx}-{part}", -val)
                    solve(num[i:], acc - prd + prd * val, f"{pfx}*{part}", prd * val)
        solve(num)
        return res
