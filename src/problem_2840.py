class Solution:
    def checkStrings(self, s1: str, s2: str) -> bool:
        res = Counter(s1[::2]) == Counter(s2[::2]) and Counter(s1[1::2]) == Counter(s2[1::2])
        return res
