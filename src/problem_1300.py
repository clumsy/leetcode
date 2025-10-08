# class Solution:
#     def findBestValue(self, arr: List[int], target: int) -> int:
#         n, arr = len(arr), sorted(arr)
#         s = [0] * n
#         s[0] = arr[0]
#         for i in range(1, n):
#             s[i] = arr[i] + s[i - 1]
#         min_diff, res = target, 0
#         lo, hi = 0, arr[-1]
#         while lo < hi:
#             mi = (lo + hi) // 2
#             i = bisect_left(arr, mi)
#             diff = target - (s[min(i - 1, n - 1)] if i > 0 else 0) - (n - i) * mi
#             if diff > 0:
#                 lo = mi + 1
#             else:
#                 hi = mi
#             if abs(diff) <= abs(min_diff):
#                 res, min_diff = min(res, mi) if abs(diff) == abs(min_diff) else mi, diff
#         i = bisect_left(arr, lo)
#         diff = target - (s[min(i - 1, n - 1)] if i > 0 else 0) - (n - i) * lo
#         if abs(diff) <= abs(min_diff):
#             res = min(res, lo) if abs(diff) == abs(min_diff) else lo
#         return res

class Solution:
    def findBestValue(self, arr: List[int], target: int) -> int:
        arr = sorted(arr, reverse=True)
        ma = arr[0]
        while arr and target >= arr[-1] * len(arr):
            target = target - arr.pop()
        return ceil(target / len(arr) - 0.5) if arr else ma
