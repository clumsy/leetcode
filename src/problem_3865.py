class Solution:
    def trimTrailingVowels(self, s: str) -> str:
        e = len(s)
        while e and s[e - 1] in "aeiou":
            e -= 1
        res = s[:e]
        return res
