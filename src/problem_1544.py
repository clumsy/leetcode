class Solution:
    def makeGood(self, s: str) -> str:
        s, e = list(s), 0
        for i in range(len(s)):
            if e > 0 and s[i] != s[e - 1] and s[i].lower() == s[e - 1].lower():
                e -= 1
            else:
                s[e] = s[i]
                e += 1
        res = "".join(s[:e])
        return res
