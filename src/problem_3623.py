class Solution:
    def countTrapezoids(self, ps: List[List[int]]) -> int:
        cnt, mod = Counter(), int(1e9) + 7
        for _, y in ps:
            cnt[y] += 1
        p, ttl = [], 0
        for c in cnt.values():
            c = c * (c - 1) // 2
            ttl += c
            p.append(c)
        res = (sum(c * (ttl - c) for c in p) // 2) % mod
        return res
