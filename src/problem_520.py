class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        n, res = len(word), True
        for i in range(1, n):
            if word[i].isupper() != word[i - 1].isupper():
                if not word[i - 1].isupper() or i > 1:
                    res = False
                    break
        return res
