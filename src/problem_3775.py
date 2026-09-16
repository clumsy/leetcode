class Solution:
    def reverseWords(self, s: str) -> str:
        vwls = set("aeiou")
        s = s.split()
        n = sum(c in vwls for c in s[0])
        for i in range(1, len(s)):
            if sum(c in vwls for c in s[i]) == n:
                s[i] = s[i][::-1]
        res = " ".join(s)
        return res
