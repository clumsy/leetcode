class Solution:
    def digitSum(self, s: str, k: int) -> str:
        def round(s):
            return "".join(str(sum(int(d) for d in i)) for i in [s[j : min(j + k, len(s))] for j in range(0, len(s), k)])

        while len(s) > k:
            s = round(s)
        return s
