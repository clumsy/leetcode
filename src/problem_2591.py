class Solution:
    def distMoney(self, m: int, c: int) -> int:
        if m < c or (c == 1 and m == 4):
            res = -1
        else:
            d, r = divmod(m, 8)
            if d > c:
                d, r = c, r + 8 * (d - c)
            res = d - (1 if (r == 4 and d == c - 1) or (d == c and r) else max(0, (c - d - r + 6)//7))
        return res

# class Solution:
#     def distMoney(self, m: int, c: int) -> int:
#         m = m - c
#         if m < 0:
#             return -1
#         if m // 7 == c and m % 7 == 0:
#             return c
#         if m // 7 == c - 1 and m % 7 == 3:
#             return c - 2
#         return min(c - 1, m / 7)
