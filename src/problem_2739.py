# class Solution:
#     def distanceTraveled(self, m: int, a: int) -> int:
#         res = 0
#         while m >= 5:
#             d, r = divmod(m, 5)
#             res = res + 5 * d
#             d = min(d, a)
#             a = a - d
#             m = r + d
#         res = (res + m) * 10
#         return res

class Solution:
    def distanceTraveled(self, m: int, a: int) -> int:
        x = min(a, (m - 1) // 4)
        res = (m + x) * 10
        return res
