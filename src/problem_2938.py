class Solution:
    def minimumSteps(self, s: str) -> int:
        res = wht = 0
        for i, b in enumerate(s):
            if b == "0":
                res += i - wht
                wht += 1
        return res
