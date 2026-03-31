class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        n, res = len(arr), 0
        for i in range(n):
            # how many times arr[i] is used for subarrays of odd length
            k = (i + 1) * (n - i)
            res += (k + 1) // 2 * arr[i]
        return res
