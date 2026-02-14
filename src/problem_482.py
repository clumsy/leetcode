class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        s = s.replace("-", "")[::-1]
        res = "-".join(s[i : i + k].upper() for i in range(0, len(s), k))[::-1]
        return res
