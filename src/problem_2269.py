class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        res, cur, s = 0, "", str(num)
        for i in range(len(s)):
            cur += s[i]
            if len(cur) > k:
                cur = cur[1:]
            if len(cur) == k:
                c = int(cur)
                res += num % c == 0 if c > 0 else 0
        return res
