# class Solution:
#     def checkIfExist(self, arr: List[int]) -> bool:
#         a = defaultdict(int)
#         for i in arr:
#             a[i] = a[i] + 1
#         for i in a.keys():
#             t = i * (2 if i >= 0 else 1 / 2)
#             if a.get(t, -1) >= (1 if i != 0 else 2):
#                 return True
#         return False


class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        arr, n = (sorted(arr), len(arr))
        for i in range(n - 1):
            if i > 0 and arr[i] == arr[i - 1]:
                continue
            lo, hi = (i + 1, n - 1)
            t = arr[i] * (2 if arr[i] >= 0 else 1 / 2)
            while lo < hi:
                mi = lo + (hi - lo) // 2
                if arr[mi] >= t:
                    hi = mi
                else:
                    lo = mi + 1
            if arr[lo] == t:
                return True
        return False
