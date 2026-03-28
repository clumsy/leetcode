class Solution:
    def modifyString(self, s: str) -> str:
        s, n = list(s), len(s)
        for i, c in enumerate(s):
            if c == "?":
                for f in ascii_lowercase:
                    if (i == 0 or f != s[i - 1]) and (i == n - 1 or f != s[i + 1]):
                        s[i] = f
                        break
        res = "".join(s)
        return res
