class Solution:
    def validSubstringCount(self, w1: str, w2: str) -> int:
        cnt, n = Counter(w2), len(w1)
        res = b = 0
        for i, c in enumerate(w1):
            cnt[c] -= 1
            while b <= i and all(v <= 0 for v in cnt.values()):
                cnt[w1[b]] += 1
                b += 1
                res += n - i
        return res
