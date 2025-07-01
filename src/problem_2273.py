class Solution:
    def removeAnagrams(self, words: List[str]) -> List[str]:
        s = []
        for w in words:
            if not s or Counter(w) != Counter(s[-1]):
                s.append(w)
        return s
