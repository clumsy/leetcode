class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        res = len(s) == len(goal) and goal in s + s
        return res
