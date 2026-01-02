class Solution:
    def reformat(self, s: str) -> str:
        parts = [[], []]
        for c in s:
            parts[c.isdigit()].append(c)
        parts.sort(key=len, reverse=True)
        res = "" if len(parts[0]) - len(parts[1]) > 1 else "".join(f + s for f, s in zip_longest(*parts, fillvalue=""))
        return res
