class Solution:
    def printVertically(self, s: str) -> List[str]:
        res = ["".join(w).rstrip() for w in zip_longest(*s.split(), fillvalue=" ")]
        return res
