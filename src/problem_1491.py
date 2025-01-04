class Solution:
    def average(self, salary: List[int]) -> float:
        s, mi, ma = 0, inf, 0
        for i in salary:
            s += i
            mi = min(mi, i)
            ma = max(ma, i)
        res = (s - mi - ma) / (len(salary) - 2)
        return res
