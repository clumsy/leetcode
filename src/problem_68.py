class Solution:
    def fullJustify(self, w: List[str], mw: int) -> List[str]:
        def format(ws, l, last=False):
            n = len(ws)
            if n == 1:
                return ws[0] + " " * (mw - l)
            if last:
                s = " ".join(ws)
                return s + " " * (mw - len(s))
            d, r = divmod(mw - l, len(ws) - 1)
            ss = [" " * (d + (i < r)) if i < n - 1 else "" for i in range(n)]
            s = [c for w, s in zip(ws, ss) for c in (w, s)]
            return "".join(s)
        b = cur = 0
        res = []
        for i in range(len(w)):
            if cur + len(w[i]) + (i - b) > mw:
                res.append(format(w[b:i], cur))
                cur = 0
                b = i
            cur += len(w[i])
        res.append(format(w[b:], cur, True))
        return res
