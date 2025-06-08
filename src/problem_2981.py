class Solution:
    def maximumLength(self, s: str) -> int:
        n, f = len(s), 0
        res, cnt = "", Counter()
        while f < n:
            i = f
            while i < n and s[i] == s[f]:
                i += 1
            num = i - f
            for l in range(num - 2, num + 1):
                sub = s[f] * l
                cnt[sub] += num - l + 1
                if cnt[sub] >= 3 and len(sub) > len(res):
                    res = sub
            f = i
        res = len(res) if res else -1
        return res
