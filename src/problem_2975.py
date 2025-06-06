class Solution:
    def maximizeSquareArea(self, m: int, n: int, hFences: List[int], vFences: List[int]) -> int:
        hFences.append(1)
        hFences.append(m)
        hFences.sort()
        hs = set()
        for i in range(len(hFences)):
            for j in range(i + 1, len(hFences)):
                hs.add(hFences[j] - hFences[i])
        vFences.append(1)
        vFences.append(n)
        vFences.sort()
        res = - 1
        for i in range(len(vFences)):
            for j in range(i + 1, len(vFences)):
                d = vFences[j] - vFences[i]
                if d in hs:
                    res = max(res, d * d)
        res = res % (10**9 + 7) if res > 0 else res
        return res
