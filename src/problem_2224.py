class Solution:
    def convertTime(self, current: str, correct: str) -> int:
        def to_mins(s):
            h, m = (int(c[c[0] == "0":]) for c in s.split(":"))
            return 60 * h + m

        cur_mins, cor_mins = sorted((to_mins(current), to_mins(correct)))
        day = 23 * 60 + 59
        delta = cor_mins - cur_mins
        op60, delta = divmod(delta, 60)
        op15, delta = divmod(delta, 15)
        op5, delta = divmod(delta, 5)
        res = op60 + op15 + op5 + delta
        return res
