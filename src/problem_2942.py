class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        res = [i for i, w in enumerate(words) if x in w]
        return res
