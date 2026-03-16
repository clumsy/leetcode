# class Solution:
#     def maxDepthAfterSplit(self, seq: str) -> List[int]:
#         h, o, n = ([], -1, len(seq))
#         for i, c in enumerate(seq):
#             if c == '(':
#                 o = o + 1
#                 if o >= len(h):
#                     h.append([])
#                 h[o].append(i)
#             else:
#                 h[o].append(i)
#                 o = o - 1
#         ma = len(h)
#         res = [1] * n
#         for i in range(ma // 2):
#             for j in h[i]:
#                 res[j] = 0
#         return res


class Solution:
    def maxDepthAfterSplit(self, seq: str) -> List[int]:
        res = [0] * len(seq)
        a = b = 0
        for i, c in enumerate(seq):
            v = 1 if c == "(" else -1
            if (v > 0) == (a < b):
                a = a + v
            else:
                res[i] = 1
                b = b + v
        return res
