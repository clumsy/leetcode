class Solution:
    def maximumPopulation(self, logs: List[List[int]]) -> int:
        year, offset = [0] * 101, 1950
        for b, d in logs:
            year[b - offset] += 1
            year[d - offset] -= 1
        res = 0
        for i in range(1, len(year)):
            year[i] += year[i - 1]
            if year[i] > year[res]:
                res = i
        res += offset
        return res
