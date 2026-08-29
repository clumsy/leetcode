# class Solution:
#     def countMonobit(self, n: int) -> int:
#         res, i = 1, 1
#         while i <= n:
#             i = 2 * i + 1
#             res += 1
#         return res


class Solution:
    def countMonobit(self, n: int) -> int:
        res = (n + 1).bit_length()
        return res
