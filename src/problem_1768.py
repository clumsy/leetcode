class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        res = "".join(c for i, j in zip_longest(word1, word2, fillvalue="") for c in (i, j))
        return res
