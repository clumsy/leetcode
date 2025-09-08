class Solution:
    def maxChunksToSorted(self, arr: List[int]) -> int:
        res, ma, n = 0, arr[0], len(arr)
        for i in range(n):
            ma = max(ma, arr[i])
            if ma == i:
                res += 1
        return res
