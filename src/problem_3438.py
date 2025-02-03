class Solution:
    def findValidPair(self, s: str) -> str:
        res, cnt = "", Counter(s)
        for i, c in enumerate(s):
            if i and s[i - 1] != c and cnt[s[i - 1]] == int(s[i - 1]) and cnt[c] == int(c):
                res = s[i - 1:i + 1]
                break
        return res
