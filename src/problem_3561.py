class Solution:
    def resultingString(self, s: str) -> str:
        res = []
        for i in s:
            if res and abs(ord(i) - ord(res[-1])) % 24 == 1:
                res.pop()
            else:
                res.append(i)
        res = "".join(res)
        return res
