class Solution:
    def buttonWithLongestTime(self, e: List[List[int]]) -> int:
        res = 1
        for i in range(1, len(e)):
            diff = (e[i][1] - e[i - 1][1]) - (e[res - 1][1] - e[res - 2][1] if res > 1 else e[0][1])
            if diff > 0:
                res = i + 1
            elif diff == 0:
                res = res if e[res - 1][0] <= e[i][0] else i + 1
        res = e[res - 1][0]
        return res
