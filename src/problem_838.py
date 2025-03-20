class Solution:
    def pushDominoes(self, dominoes: str) -> str:
        dominoes = "L" + dominoes + "R"
        res, prev = [], 1
        for i, d in enumerate(dominoes):
            n = i - prev + 1
            if d == "L":
                if dominoes[prev] != "R":
                    s = "L" * n
                else:  # R
                    s = "R" * (n // 2) + ("." * (n & 1)) + "L" * (n // 2)
                res.append(s)
                prev = i + 1
            elif d == "R":
                res.append(dominoes[prev] * (n - 1))
                prev = i
        res = "".join(res)
        return res
