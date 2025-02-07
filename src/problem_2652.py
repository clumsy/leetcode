class Solution:
    def sumOfMultiples(self, n: int) -> int:
        res = 0
        res = res + (3 * ((1 + n // 3) * (n // 3)) // 2 if n >= 3 else 0)
        res = res + (5 * ((1 + n // 5) * (n // 5)) // 2 if n >= 5 else 0)
        res = res + (7 * ((1 + n // 7) * (n // 7)) // 2 if n >= 7 else 0)
        res = res - (5 * 3 * ((1 + n // (5 * 3)) * (n // (5 * 3))) // 2 if n >= 5 * 3 else 0)
        res = res - (7 * 5 * ((1 + n // (7 * 5)) * (n // (7 * 5))) // 2 if n >= 7 * 5 else 0)
        res = res - (7 * 3 * ((1 + n // (7 * 3)) * (n // (7 * 3))) // 2 if n >= 7 * 3 else 0)
        res = res + (7 * 5 * 3 * ((1 + n // (7 * 5 * 3)) * (n // (7 * 5 * 3))) // 2 if n >= 7 * 5 * 3 else 0)
        return res

# class Solution:
#     def sumOfMultiples(self, n: int) -> int:
#         res = 0
#         for i in range(1, n + 1):
#             if i % 3 == 0 or i % 5 == 0 or i % 7 == 0:
#                 res = res + i
#         return res
