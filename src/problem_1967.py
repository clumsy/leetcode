class Solution:
    def numOfStrings(self, patterns: List[str], word: str) -> int:
        res = sum(p in word for p in patterns)
        return res
