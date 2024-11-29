class Solution:
    def categorizeBox(self, l: int, w: int, h: int, m: int) -> str:
        bulky = max(l, w, h) >= 1e4 or l * w * h >= 1e9
        heavy = m >= 100
        if bulky and heavy:
            return "Both"
        if bulky:
            return "Bulky"
        if heavy:
            return "Heavy"
        return "Neither"
