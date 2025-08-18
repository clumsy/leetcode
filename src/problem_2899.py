class Solution:
    def lastVisitedIntegers(self, words: List[str]) -> List[int]:
        res = []
        prv = e = 0
        for i, w in enumerate(words):
            if w == "prev":
                res.append(int(words[e - 1 - prv]) if e - 1 - prv >= 0 else -1)
                prv += 1
            else:
                words[e] = w
                e += 1
                prv = 0
        return res
