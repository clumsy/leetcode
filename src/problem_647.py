class Solution:
    def countSubstrings(self, s: str) -> int:
        n = len(s)

        def count_palindroms(lo, hi):
            res = 0
            while lo >= 0 and hi < n and s[lo] == s[hi]:
                res += 1
                lo -= 1
                hi += 1
            return res

        res = 0
        for i in range(n):
            res += count_palindroms(i, i)
            if i < n - 1:
                res += count_palindroms(i, i + 1)
        return res
