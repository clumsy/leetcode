class Solution:
    def slowestKey(self, releaseTimes: List[int], keysPressed: str) -> str:
        res, n, max_d = "a", len(releaseTimes), 0
        for i in range(n):
            d = releaseTimes[i] - (releaseTimes[i - 1] if i > 0 else 0)
            if d >= max_d:
                res = max(res, keysPressed[i]) if d == max_d else keysPressed[i]
                max_d = max(max_d, d)
        return res
