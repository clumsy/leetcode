class Solution:
    def calculate(self, s: str) -> int:
        num = 0
        num_st = []
        prev_op = "+"
        for i in s + "+":
            if i.isdigit():
                num = num * 10 + (ord(i) - ord("0"))
            elif i == " ":
                continue
            else:
                if prev_op == '+':
                    num_st.append(num)
                elif prev_op == '-':
                    num_st.append(-num)
                elif prev_op == '/':
                    num_st.append(int(num_st.pop() / num))
                elif prev_op == '*':
                    num_st.append(num_st.pop() * num)
                num = 0
                prev_op = i
        res = sum(num_st)
        return res

# class Solution:
#     def calculate(self, s: str) -> int:
#         s = s.replace(" ", "")
#         vals, ops = [int(i) for i in s.translate(str.maketrans("+-/*", "    ")).split()], [c for c in s if c in "+-/*"]
#         vals_, ops_ = [vals[0]], []
#         for i, o in enumerate(ops):
#             if o in "/*":
#                 vals_.append(vals_.pop() * vals[i + 1] if o == "*" else vals_.pop() // vals[i + 1])
#             else:
#                 vals_.append(vals[i + 1])
#                 ops_.append(o)
#         res = vals_[0]
#         for i, o in enumerate(ops_):
#             res += (1 if o == "+" else -1) * vals_[i + 1]
#         return res
