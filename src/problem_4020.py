class Solution:
    def elevatorRequests(self, n: int, rs: list[int]) -> int:
        res = p = 0
        for i in rs:
            res += abs(i - p)
            p = i
        return res
