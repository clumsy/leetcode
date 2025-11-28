class Solution:
    def arrangeWords(self, text: str) -> str:
        res = " ".join(sorted(text.split(), key=len)).capitalize()
        return res
