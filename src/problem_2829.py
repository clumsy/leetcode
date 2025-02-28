class Solution:
    def minimumSum(self, n: int, k: int) -> int:
        h = min(k // 2, n)
        res = (1 + h) * h // 2 + (2 * k + n - h - 1) * (n - h) // 2
        return res

# class Solution:
#     def minimumSum(self, n: int, k: int) -> int:
#         avoid = {k - i for i in range(1, k) if k - i > i}
#         res, i = ([], 1)
#         while n:
#             if i not in avoid:
#                 res.append(i)
#                 n = n - 1
#             i = i + 1
#         res = sum(res)
#         return res
