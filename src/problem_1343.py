class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        s = 0
        for i in range(k):
            s += arr[i]
        res = int(s // k >= threshold)
        for i in range(k, len(arr)):
            s -= arr[i - k]
            s += arr[i]
            res += s // k >= threshold
        return res
