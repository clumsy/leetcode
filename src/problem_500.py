from operator import ior
from functools import reduce


class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        m = {}
        for c in "qwertyuiop":
            m[c] = 1
        for c in "asdfghjkl":
            m[c] = 2
        for c in "zxcvbnm":
            m[c] = 4
        res = [w for w in words if reduce(ior, map(m.__getitem__, w.lower())) in [1, 2, 4]]
        return res
