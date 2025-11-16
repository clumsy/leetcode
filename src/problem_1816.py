class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        res = " ".join(s.split()[:k])
        return res
