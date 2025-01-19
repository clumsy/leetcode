class Solution
    def mctFromLeafValues(self, A):
        res = 0
        stk = [float('inf')]
        for a in A:
            while stk[-1] <= a:
                res += stk.pop() * min(stk[-1], a)
            stk.append(a)
        while len(stk) > 2:
            res += stk.pop() * stk[-1]
        return res

# class Solution:
#     def mctFromLeafValues(self, arr: List[int]) -> int:
#         res = 0
#         while len(arr) > 1:
#             mi = 0
#             for i in range(1, len(arr) - 1):
#                 if max(arr[i], arr[i + 1]) < max(arr[mi], arr[mi + 1]):
#                     mi = i
#             res += arr[mi] * arr[mi + 1]
#             arr = arr[:mi] + [max(arr[mi], arr[mi + 1])] + arr[mi + 2:]
#         return res
