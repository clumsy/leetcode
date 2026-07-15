class Solution:
    def secondsBetweenTimes(self, st: str, et: str) -> int:
        def t(s):
            h, m, sec = map(int, s.split(":"))
            return h * 3600 + m * 60 + sec

        return t(et) - t(st)
