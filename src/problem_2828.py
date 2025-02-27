class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:
        res = s == "".join(w[0] for w in words)
        return res
