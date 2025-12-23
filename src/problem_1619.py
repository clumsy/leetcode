class Solution:
    def trimMean(self, arr: List[int]) -> float:
        # can be made O(n) with QuickSelect
        # using easier O(n*log(n)) solution with sorting
        arr.sort()
        n = len(arr)
        arr = arr[int(0.05 * n) : int(0.95 * n)]
        res = sum(arr) / len(arr)
        return res
