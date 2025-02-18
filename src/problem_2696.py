class Solution:
    def minLength(self, s: str) -> int:
        st = []
        for c in s:
            if st and st[-1] + c in 'AB|CD':
                st.pop()
            else:
                st.append(c)
        res = len(st)
        return res

# class Solution:
#     def minLength(self, s: str) -> int:
#         while True:
#             s_ = s.replace("AB", "").replace("CD", "")
#             if s == s_:
#                 break
#             s = s_
#         res = len(s)
#         return res
