class Solution:
    def arrangeCoins(self, n: int) -> int:
        # (1 + k) * k // 2 = n
        # k^2 + k - 2n = 0
        # D = 1 + 8n
        # k = (-1 + sqrt(D)) // 2
        return (-1 + floor(sqrt(1 + 8 * n))) // 2
