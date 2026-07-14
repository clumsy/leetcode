# class Solution:
#     def generateValidStrings(self, n: int, k: int) -> list[str]:
#         res = []
#         for i in range(1 << n):
#             j = kk = 0
#             while j <= i and kk <= k:
#                 x = 1 << j
#                 if i & x == x:
#                     if j and i & (x >> 1) == (x >> 1):
#                         kk = k + 1
#                         break
#                     kk += j
#                 j += 1
#             if kk <= k:
#                 r = bin(i)[2:]
#                 r = "0" * (n - len(r)) + r
#                 res.append(r[::-1])
#         return res


class Solution:
    def generateValidStrings(self, n: int, k: int) -> list[str]:
        res, cst = ["0", "1"], [0, 0]
        for i in range(2, n + 1):
            nxt_res, nxt_cst = [], []
            for j, v in enumerate(res):
                nxt_res.append(v + "0")
                nxt_cst.append(cst[j])
                if v.endswith("0") and cst[j] + i - 1 <= k:
                    nxt_res.append(v + "1")
                    nxt_cst.append(cst[j] + i - 1)
            res, cst = nxt_res, nxt_cst
        return res
