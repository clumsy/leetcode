class Solution:
    def minCost(self, colors: str, neededTime: List[int]) -> int:
        res = s = ma = 0
        for i, e in enumerate(colors):
            if i > 0 and colors[i - 1] == colors[i]:
                ma = max(ma, neededTime[i])
                s += neededTime[i]
            else:
                res += s - ma
                s = ma = neededTime[i]
        else:
            res += s - ma
        return res
