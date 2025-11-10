class Solution:
    def isCovered(self, ranges: List[List[int]], left: int, right: int) -> bool:
        rng = [0] * 52
        for s, e in ranges:
            rng[s] += 1
            rng[e + 1] -= 1
        rng = list(accumulate(rng))
        res = True
        for i in range(left, right + 1):
            if rng[i] < 1:
                res = False
                break
        return res
