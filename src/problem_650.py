# class Solution:
#     def minSteps(self, n: int) -> int:
#         res, q, stop = (-1, deque([('A', '')]), False)
#         while not stop:
#             res = res + 1
#             for _ in range(len(q)):
#                 s, op = q.pop()
#                 if len(s) == n:
#                     stop = True
#                     break
#                 if s != op:
#                     q.appendleft((s, s))
#                 if op and len((nxt := (s + op))) <= n:
#                     q.appendleft((nxt, op))
#         return res

# class Solution:
#     def minSteps(self, n: int) -> int:
#         if n <= 5:
#             res = n if n > 1 else 0
#         else:
#             res = n
#             for p in [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]:
#                 if n % p == 0:
#                     res = p + self.minSteps(n // p)
#                     break
#         return res


class Solution:
    def minSteps(self, n):
        def factors(n):
            d = 2
            while d * d <= n:
                while n % d == 0:
                    n = n / d
                    yield d
                d = d + 1
            if n > 1:
                yield n

        return sum(factors(n))
