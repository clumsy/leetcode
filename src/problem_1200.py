class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        arr.sort()
        mi = min(b - a for b, a in zip(arr[1:], arr))
        res = [[a, b] for b, a in zip(arr[1:], arr) if b - a == mi]
        return res
