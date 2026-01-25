class Solution:
    def findLexSmallestString(self, s: str, a: int, b: int) -> str:
        res = s
        seen, q = set(), [s]
        while q:
            cur = q.pop()
            res = min(res, cur)
            nxt = [int(d) for d in cur]
            for i in range(1, len(nxt), 2):
                nxt[i] = (nxt[i] + a) % 10
            rot = cur[-b:] + cur[:-b]
            for x in [rot, "".join(str(i) for i in nxt)]:
                if x not in seen:
                    seen.add(x)
                    q.append(x)
        return res
