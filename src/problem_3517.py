class Solution:
    def smallestPalindrome(self, s: str) -> str:
        cnt, n = Counter(s), len(s)
        last = "" if n & 1 == 0 else None
        res = []
        for c in sorted(cnt.keys()):
            v = cnt[c]
            if last is None and v & 1 == 1:
                last = c
            res.append(c * (v // 2))
        res = "".join(res)
        res = res + last + res[::-1]
        return res
