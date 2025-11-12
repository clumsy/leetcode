class Solution:
    def makeEqual(self, words: List[str]) -> bool:
        n, cnt = len(words), Counter()
        for w in words:
            cnt.update(w)
        res = all(v % n == 0 for v in cnt.values())
        return res
