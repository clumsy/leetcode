class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort(), s.sort()
        res = j = 0
        for e in g:
            while j < len(s) and s[j] < e:
                j += 1
            if j == len(s):
                break
            res += s[j] >= e
            j += 1
        return res
