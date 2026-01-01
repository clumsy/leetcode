# class Solution:
#     def getHappyString(self, n: int, k: int) -> str:
#         st, res = ([''], '')
#         while st:
#             res = ''
#             s = st.pop()
#             if len(s) < n:
#                 for c in ['c', 'b', 'a']:
#                     if not s or s[-1] != c:
#                         st.append(s + c)
#             else:
#                 k = k - 1
#                 if k == 0:
#                     res = s
#                     break
#         return res


class Solution:
    def getHappyString(self, n: int, k: int) -> str:
        perms, res = (2 ** (n - 1), "")
        if k <= 3 * perms:
            res = [chr(ord("a") + (k - 1) // perms)]
            while perms > 1:
                k = (k - 1) % perms + 1
                perms = perms // 2
                c = (
                    chr(ord("a") + (len(res) > 0 and res[-1] == "a"))
                    if (k - 1) // perms == 0
                    else chr(ord("b") + (len(res) == 0 or res[-1] != "c"))
                )
                res.append(c)
            res = "".join(res)
        return res
