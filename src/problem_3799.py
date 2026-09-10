class Solution:
    def wordSquares(self, ws: List[str]) -> List[List[str]]:
        res = []
        ws.sort()
        for w1 in ws:
            for w2 in ws:
                if w2 == w1 or w2[0] != w1[0]:
                    continue
                for w3 in ws:
                    if w3 == w1 or w3 == w2 or w3[0] != w1[-1]:
                        continue
                    for w4 in ws:
                        if (
                            w4 == w1
                            or w4 == w2
                            or w4 == w3
                            or w4[0] != w2[-1]
                            or w4[-1] != w3[-1]
                        ):
                            continue
                        res.append((w1, w2, w3, w4))
        return res
