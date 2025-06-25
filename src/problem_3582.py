class Solution:
    def generateTag(self, c: str) -> str:
        res = "".join((ch[0].upper() if i > 0 else ch[0].lower()) + ch[1:].lower() for i, ch in enumerate(c.split()))
        res = "#" + "".join(c for c in res if ord("a") <= ord(c.lower()) <= ord("z"))
        res = res[:min(len(res), 100)]
        return res
