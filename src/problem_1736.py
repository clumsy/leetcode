class Solution:
    def maximumTime(self, time: str) -> str:
        time = list(time)
        for i, e in enumerate(time):
            if e == "?":
                time[i] = (
                    "5" if i == 3 else 
                    "9" if i == 4 else
                    "2" if i == 0 and time[1] in ["0", "1", "2", "3", "?"] else
                    "1" if i == 0 else
                    "9" if i == 1 and time[0] in ["0", "1"] else 
                    "3"
                )
        res = "".join(time)
        return res
