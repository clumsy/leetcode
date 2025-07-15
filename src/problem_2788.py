class Solution:
    def splitWordsBySeparator(self, words: List[str], separator: str) -> List[str]:
        res = []
        for w in words:
            for c in w.split(separator):
                if c:
                    res.append(c)
        return res
