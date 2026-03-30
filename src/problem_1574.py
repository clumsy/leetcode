# class Solution:
#     def findLengthOfShortestSubarray(self, arr: List[int]) -> int:
#         n = len(arr)
#         m = [arr[-1]] * n
#         for i in reversed(range(n - 1)):
#             m[i] = arr[i] if arr[i] <= m[i + 1] else -1
#         res = n - 1
#         for i in range(-1, n - 1):
#             if i > 0 and arr[i] < arr[i - 1]:
#                 break
#             lo, hi = i, n
#             while lo < hi:
#                 mi = (lo + hi) // 2
#                 if m[mi] >= (arr[i] if i >= 0 else 0):
#                     hi = mi
#                 else:
#                     lo = mi + 1
#             res = max(min(res, lo - i - 1), 0)
#         return res


class Solution:
    def findLengthOfShortestSubarray(self, arr: List[int]) -> int:
        n = len(arr)
        j = n - 1
        while j > 0 and arr[j - 1] <= arr[j]:
            j = j - 1
        i, res = (0, j)
        while i < j and (i == 0 or arr[i] >= arr[i - 1]):
            while j < n and arr[j] < arr[i]:
                j = j + 1
            res = min(res, j - i - 1)
            i = i + 1
        return res
