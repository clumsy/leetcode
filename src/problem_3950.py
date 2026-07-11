# class Solution:
#     def consecutiveSetBits(self, n: int) -> bool:
#         res, i = 0, 3
#         while i <= n:
#             res += (i & n) == i
#             if res > 1:
#                 break
#             i <<= 1
#         res = res == 1
#         return res


class Solution:
    def consecutiveSetBits(self, n: int) -> bool:
        x = n & (n >> 1)
        res = x > 0 and (x & (x - 1)) == 0
        return res
