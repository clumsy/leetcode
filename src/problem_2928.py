class Solution:
    def distributeCandies(self, n: int, limit: int) -> int:
        res = 0
        for i in range(min(limit, n) + 1):
            for j in range(min(limit, n - i) + 1):
                res += n - i - j <= limit
        return res
