class Solution:
    def residuePrefixes(self, s: str) -> int:
        res = ttl = cnt = 0
        for i, c in enumerate(s):
            cur = 1 << (ord(c) - ord("a"))
            ttl += (cnt & cur) == 0
            cnt |= cur
            res += ttl == ((i + 1) % 3)
            if ttl > 2:
                break
        return res
