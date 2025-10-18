class Solution:
    def reformatDate(self, date: str) -> str:
        mon = {
            "Jan": "01",
            "Feb": "02",
            "Mar": "03",
            "Apr": "04",
            "May": "05",
            "Jun": "06",
            "Jul": "07",
            "Aug": "08",
            "Sep": "09",
            "Oct": "10",
            "Nov": "11",
            "Dec": "12",
        }
        day, month, year = date.split()
        day = day.replace("st", "").replace("th", "").replace("rd", "").replace("nd", "")
        res = f"{year}-{mon[month]}-{day:0>2}"
        return res
