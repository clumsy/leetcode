class Solution:
    def angleClock(self, hour: int, minutes: int) -> float:
        hour_degrees = (hour + minutes / 60) * (360 / 12)
        minutes_degrees = minutes * (360 / 60)
        diff = abs(hour_degrees - minutes_degrees)
        res = min(diff, 360 - diff)
        return res
