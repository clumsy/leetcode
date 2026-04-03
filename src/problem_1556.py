class Solution:
    def thousandSeparator(self, n: int) -> str:
        size = len(str(n))
        if size < 4:
            res = str(n)
        else:
            size += (size - 1) // 3
            res = ["."] * size
            i = -1
            while n:
                size -= 1
                if (len(res) - size) % 4 == 0:
                    continue
                n, d = divmod(n, 10)
                res[size] = str(d)
            res = "".join(res)
        return res
