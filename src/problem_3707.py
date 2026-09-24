class Solution:
    def scoreBalance(self, s: str) -> bool:
        res, ttl, cur = False, sum(ord(c) - ord("a") + 1 for c in s), 0
        for c in s:
            cur += ord(c) - ord("a") + 1
            if 2 * cur == ttl:
                res = True
                break
        return res
