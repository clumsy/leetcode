class Solution:
    def validSubstringCount(self, w1: str, w2: str) -> int:
        cnt, n = Counter(w2), len(w1)
        res = b = 0
        rem = len(cnt)
        for i, c in enumerate(w1):
            cnt[c] -= 1
            rem -= cnt[c] == 0
            while rem == 0:
                rem += cnt[w1[b]] == 0
                cnt[w1[b]] += 1
                b += 1
            res += b
        return res
