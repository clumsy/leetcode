class Solution:
    def toHex(self, num: int) -> str:
        res = []
        while (num or not res) and len(res) < 8:
            num, r = divmod(num, 16)
            res.append(str(r) if r < 10 else "abcdef"[r - 10])
        res = "".join(res[::-1])
        return res
