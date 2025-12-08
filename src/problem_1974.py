class Solution:
    def minTimeToType(self, word: str) -> int:
        cur, res = "a", 0
        for c in word:
            diff = ord(cur) - ord(c)
            res += 1 + min(abs(diff), 26 - abs(diff))
            cur = c
        return res
