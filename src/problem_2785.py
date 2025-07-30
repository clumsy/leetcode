class Solution:
    def sortVowels(self, s: str) -> str:
        vls = sorted((c for c in s if c.lower() in "aeiou"), key=ord, reverse=True)
        res = "".join(vls.pop() if c.lower() in "aeiou" else c for c in s)
        return res
