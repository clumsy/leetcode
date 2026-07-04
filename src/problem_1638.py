class Solution:
    def countSubstrings(self, s: str, t: str) -> int:
        n, m = len(s), len(t)

        def same(i, j):
            res = pre = cur = 0
            for k in range(min(n - i, m - j)):
                cur += 1
                if s[i + k] != t[j + k]:
                    pre, cur = cur, 0
                res += pre
            return res

        return sum(same(i, 0) for i in range(n)) + sum(same(0, j) for j in range(1, m))
