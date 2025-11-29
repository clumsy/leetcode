class Solution:
    def busyStudent(self, s: List[int], e: List[int], q: int) -> int:
        res = sum(s[i] <= q <= e[i] for i in range(len(s)))
        return res
