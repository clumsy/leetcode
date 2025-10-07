class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        cnt, n = Counter(), len(s)
        res = b = 0
        for i, c in enumerate(s):
            cnt[c] += 1
            while cnt["a"] and cnt["b"] and cnt["c"]:
                cnt[s[b]] -= 1
                b += 1
            res += b
        return res
