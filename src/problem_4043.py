class Solution:
    def countRotations(self, s: str, k: int) -> int:
        res = 0
        for i in range(len(s)):
            res += sum(a == b for a, b in pairwise(s[i:] + s[:i])) == k
        return res
