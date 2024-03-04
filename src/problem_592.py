import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 592](https://leetcode.com/problems/fraction-addition-and-subtraction)")
    return


@app.cell
def __():
    from math import gcd
    return gcd,


@app.cell
def __(gcd):
    class Solution:
        def fractionAddition(self, e: str) -> str:
            num, den, n_ = 0, 1, None
            e = e.split("/")
            for i, s in enumerate(e):
                if i == 0:
                    n = int(s)
                    continue
                elif i == len(e) - 1:
                    d = int(s)
                elif "-" in s:
                    d, n_ = (int(i) for i in s.split("-"))
                    n_ *= -1
                elif "+" in s:
                    d, n_ = (int(i) for i in s.split("+"))
                num, den = num * d + den * n, den * d
                g = gcd(num, den)
                num, den = num // g, den // g
                n = n_
            res = f"{num}/{den}"
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.fractionAddition("-1/2+1/2") == "0/1"
    return


@app.cell
def __(sol):
    assert sol.fractionAddition("-1/2+1/2+1/3") == "1/3"
    return


@app.cell
def __(sol):
    assert sol.fractionAddition("1/3-1/2") == "-1/6"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
