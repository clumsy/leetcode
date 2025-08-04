class Solution:
    def concatHex36(self, n: int) -> str:
        d36 = digits + ascii_uppercase
        def convert(x, b):
            res = []
            while x:
                x, r = divmod(x, b)
                res.append(d36[r])
            return "".join(res[::-1])
        res = convert(n ** 2, 16) + convert(n ** 3, 36)
        return res
