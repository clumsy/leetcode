class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        res, cnt, vowels = 0, 0, "aeiou"
        for i, c in enumerate(s):
            if i >= k:
                cnt -= s[i - k] in vowels
            if c in vowels:
                cnt += 1
                res = min(k, max(res, cnt))
        return res
