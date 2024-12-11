class Solution:
    def vowelStrings(self, words: List[str], queries: List[List[int]]) -> List[int]:
        n, vowels = len(words), "aeiou"
        v = [0] * n
        for i in range(n):
            if i > 0:
                v[i] += v[i - 1]
            if words[i][0] in vowels and words[i][-1] in vowels:
                v[i] += 1
        res = []
        for l, r in queries:
            res.append(v[r] - (v[l - 1] if l > 0 else 0))
        return res
