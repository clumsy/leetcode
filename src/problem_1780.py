# class Solution:
#     def checkPowersOfThree(self, n: int) -> bool:
#         res, seen = (False, set())
#         q = [()]
#         while q and (not res):
#             for _ in range(len(q)):
#                 cur = q.pop()
#                 s = sum(cur)
#                 if s > n:
#                     continue
#                 if s == n:
#                     res = True
#                     break
#                 seen.add(s)
#                 p = max(cur) * 3 if cur else 1
#                 while p <= n - s:
#                     q.append((*cur, p))
#                     p = p * 3
#         return res

class Solution:
    def checkPowersOfThree(self, n: int) -> bool:
        while n > 0 and n % 3 != 2:
            n = n - 1 if n % 3 == 1 else n // 3
        res = n == 0
        return res
