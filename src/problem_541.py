class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        s, n = list(s), len(s)
        for i in range(0, n, 2 * k):
            j = min(n - 1, i + k - 1)
            while i < j:
                s[i], s[j] = s[j], s[i]
                i += 1
                j -= 1
        res = "".join(s)
        return res
