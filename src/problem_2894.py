# class Solution:
#     def differenceOfSums(self, n: int, m: int) -> int:
#         res = 0
#         for i in range(1, n + 1):
#             res = res + (i if i % m != 0 else -i)
#         return res

class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        k = n // m
        res = (1 + n) * n // 2 - m * (1 + k) * k
        return res
