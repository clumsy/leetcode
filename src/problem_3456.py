class Solution:
    def hasSpecialSubstring(self, s: str, k: int) -> bool:
        cnt = Counter(s[:k - 1])
        res, n = False, len(s)
        for i in range(k - 1, n):
            cnt[s[i]] += 1
            if i - k >= 0:
                c = s[i - k]
                cnt[c] -= 1
                if cnt[c] == 0:
                    del cnt[c]
            if (
                len(cnt) == 1 and 
                (i - k < 0 or s[i - k] != s[i]) and
                (i == n - 1 or s[i + 1] != s[i])
            ):
                res = True
                break
        return res
