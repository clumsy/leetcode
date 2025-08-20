class Solution:
    def shortestCompletingWord(self, licensePlate: str, words: List[str]) -> str:
        plate = Counter(c.lower() for c in licensePlate if c not in " 1234567890")
        res = -1
        for i, w in enumerate(words):
            if res < 0 or len(w) < len(words[res]):
                cnt = Counter(w)
                cnt.subtract(plate)
                if all(v >= 0 for v in cnt.values()):
                    res = i      
        res = words[res]
        return res
