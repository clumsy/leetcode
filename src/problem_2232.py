class Solution:
    def minimizeResult(self, e: str) -> str:
        lft, rgt = e.split("+")
        mi = inf
        for l in range(len(lft)):
            for r in range(1, len(rgt) + 1):
                cur = int(lft[:l] or 1) * (int(lft[l:]) + int(rgt[:r])) * int(rgt[r:] or 1)
                if cur < mi:
                    res = f"{lft[:l]}({lft[l:]}+{rgt[:r]}){rgt[r:]}"
                    mi = min(mi, cur)
        return res
