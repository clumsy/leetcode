# class Solution:
#     def maximumElementAfterDecrementingAndRearranging(self, arr: List[int]) -> int:
#         arr.sort()
#         arr[0] = 1
#         for i in range(1, len(arr)):
#             arr[i] = min(arr[i - 1] + 1, arr[i])
#         res = arr[-1]
#         return res


class Solution:
    def maximumElementAfterDecrementingAndRearranging(self, arr: List[int]) -> int:
        n, cnt = (len(arr), Counter())
        for i in arr:
            cnt[min(n, i)] = cnt[min(n, i)] + 1
        res = 1
        for i in range(1, n + 1):
            res = min(res + cnt[i], i)
        return res
