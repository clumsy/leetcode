class Solution:
    def dayOfTheWeek(self, day: int, month: int, year: int) -> str:
        dow = datetime.date(year, month, day).isoweekday()
        res = {
            1: "Monday",
            2: "Tuesday",
            3: "Wednesday",
            4: "Thursday",
            5: "Friday",
            6: "Saturday",
            7: "Sunday",
        }[dow]
        return res
