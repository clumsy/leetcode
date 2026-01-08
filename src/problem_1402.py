class Solution:
    def maxSatisfaction(self, satisfaction: List[int]) -> int:
        satisfaction.sort(reverse=True)
        res, s, p = 0, 0, 0
        for i in satisfaction:
            s += p + i
            res = max(res, s)
            p += i
            if p < 0:
                break
        return res
