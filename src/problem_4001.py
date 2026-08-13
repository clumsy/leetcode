class Solution:
    def aggregateTimeSeries(
        self, s1: list[list[int]], s2: list[list[int]]
    ) -> list[list[int]]:
        i1 = i2 = 0
        res = []
        while i1 < len(s1) or i2 < len(s2):
            if i1 == len(s1):
                res.append(s2[i2])
                i2 += 1
            elif i2 == len(s2):
                res.append(s1[i1])
                i1 += 1
            else:
                s, i = (s1, i1) if s1[i1][0] <= s2[i2][0] else (s2, i2)
                res.append([s[i][0], s1[i1][1] + s2[i2][1]])
                i1 += s1[i1][0] == s[i][0]
                i2 += s2[i2][0] == s[i][0]
        return res
