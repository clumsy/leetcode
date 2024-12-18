class Solution:
    def splitNum(self, num: int) -> int:
        num = "".join(sorted(str(num)))
        res = int(num[::2]) + int(num[1::2])
        return res
