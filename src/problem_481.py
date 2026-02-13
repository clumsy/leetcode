# class Solution:
#     def magicalString(self, n: int) -> int:
#         s, i = ([1, 2, 2], 2)
#         while len(s) < n:
#             s.extend([s[-1] ^ 3] * s[i])
#             i = i + 1
#         return s[:n].count(1)


class Solution:
    def magicalString(self, n: int) -> int:
        s, i = ([1], 0)
        while len(s) < n:
            c = s[i]
            if c == 2:
                s.append(s[-1])
            s.append(1 if s[-1] == 2 else 2)
            i = i + 1
        return s[:n].count(1)
