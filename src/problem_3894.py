class Solution:
    def trafficSignal(self, t: int) -> str:
        res = "Green" if t == 0 else "Orange" if t == 30 else "Red" if 30 < t <= 90 else "Invalid"
        return res
