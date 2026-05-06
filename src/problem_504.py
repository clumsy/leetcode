class Solution:
    def convertToBase7(self, num: int) -> str:
        n, res = abs(num), []
        while n:
            res.append(n % 7)
            n //= 7
        res = "-" * (num < 0) + "".join(str(i) for i in res[::-1]) or "0"
        return res
