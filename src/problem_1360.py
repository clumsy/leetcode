class Solution:
    def daysBetweenDates(self, date1: str, date2: str) -> int:
        def days(date):
            y, m, d = (int(i.lstrip("0")) for i in date.split("-"))
            num_leap = (
                (y - 1) // 4
                - (y - 1) // 100
                + (y - 1) // 400
                + (m > 2 and y % 4 == 0 and (y % 100 != 0 or y % 400 == 0))
            )
            num_days = {
                1: 31,
                2: 28,
                3: 31,
                4: 30,
                5: 31,
                6: 30,
                7: 31,
                8: 31,
                9: 30,
                10: 31,
                11: 30,
                12: 31,
            }
            return y * 365 + d + sum(num_days[i] for i in range(1, m)) + num_leap

        res = abs(days(date2) - days(date1))
        return res
