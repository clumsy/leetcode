class Solution:
    def minSensors(self, n: int, m: int, k: int) -> int:
        k = 2 * k + 1
        res = ((m + k - 1) // k) * ((n + k - 1) // k)
        return res
