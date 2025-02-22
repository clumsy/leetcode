class Solution:
    def finalString(self, s: str) -> str:
        a, b = ([], [])
        for i in range(len(s)):
            if s[i] == 'i':
                a, b = (b, a)
            else:
                a = a + s[i]
        b.reverse()
        res = ''.join(b + a)
        return res

# class Solution:
#     def finalString(self, s: str) -> str:
#         s = list(s)
#         for i in range(len(s)):
#             if s[i] == "i":
#                 s[:i], s[i] = s[:i][::-1], ""
#         res = "".join(s)
#         return res
