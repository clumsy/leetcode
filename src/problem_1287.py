class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        n = len(arr)

        def count(i):
            return bisect_right(arr, i) - bisect_left(arr, i)

        res = (
            arr[n // 4]
            if count(arr[n // 4]) > n / 4
            else arr[n // 2]
            if count(arr[n // 2]) > n / 4
            else arr[3 * n // 4]
        )
        return res
