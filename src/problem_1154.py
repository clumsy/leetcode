class Solution:
    def dayOfYear(self, date: str) -> int:
        year, month, day = (int(i.lstrip("0")) for i in date.split("-"))
        days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        is_leap = year % 4 == 0 and (year % 400 == 0 or year % 100 != 0)
        res = day + sum(days[:month]) + (is_leap and month > 2)
        return res
