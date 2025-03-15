class Solution:
    def largeGroupPositions(self, s: str) -> List[List[int]]:
        res, n, i = [], len(s), 0
        while i < n:
            e = i
            while e < n and s[e] == s[i]:
                e += 1
            if e - i >= 3:
                res.append([i, e - 1])
            i = e
        return res
