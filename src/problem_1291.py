class Solution:
    def sequentialDigits(self, low: int, high: int) -> List[int]:
        res, q = [], deque(range(1, 10))
        while q:
            e = q.popleft()
            if low <= e <= high:
                res.append(e)
            last = e % 10
            if last < 9:
                q.append(e * 10 + last + 1)
        return res
