class Solution:
    def largestInteger(self, num: int) -> int:
        odd, even = [], []
        n = num
        while n > 0:
            n, d = divmod(n, 10)
            heappush(even if d & 1 == 0 else odd, d)
        res, p = 0, 1
        while num > 0:
            num, d = divmod(num, 10)
            res += heappop(even if d & 1 == 0 else odd) * p
            p *= 10
        return res
