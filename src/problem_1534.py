# class Solution:
#     def countGoodTriplets(self, arr: List[int], a: int, b: int, c: int) -> int:
#         n, res = (len(arr), 0)
#         for j in range(1, n - 1):
#             for i in range(j):
#                 for k in range(j + 1, n):
#                     res = res + int(abs(arr[i] - arr[j]) <= a and abs(arr[j] - arr[k]) <= b and (abs(arr[i] - arr[k]) <= c))
#         return res


class Solution:
    def countGoodTriplets(self, arr: List[int], a: int, b: int, c: int) -> int:
        MAX, n, res = (1001, len(arr), 0)
        left, right = ([0] * MAX, [0] * MAX)
        left[arr[0]] = 1
        for i in range(2, n):
            right[arr[i]] = right[arr[i]] + 1
        for i in range(1, MAX):
            right[i] = right[i] + right[i - 1]
        for j in range(1, n - 1):
            aj = arr[j]
            min_j = max(aj - b, 0)
            max_j = min(aj + b, MAX - 1)
            for ai in range(max(aj - a, 0), min(aj + a + 1, MAX)):
                if left[ai] == 0:
                    continue
                min_i = max(ai - c, min_j)
                max_i = min(ai + c, max_j)
                if min_i <= max_i:
                    res = res + left[ai] * (right[max_i] - (right[min_i - 1] if min_i > 0 else 0))
            left[aj] = left[aj] + 1
            for i in range(arr[j + 1], MAX):
                right[i] = right[i] - 1
        return res
