class Solution:
    def minMaxDifference(self, num: int) -> int:
        s = str(num)
        n = len(s)
        i = next((i for i in range(n) if s[i] != "9"), 0)
        res = int(s.replace(s[i], "9")) - int(s.replace(s[0], "0"))
        return res
