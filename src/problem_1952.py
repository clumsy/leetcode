import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1952](https://leetcode.com/problems/three-divisors)")
    return


@app.cell
def __():
    class Solution:
        def isThree(self, n: int) -> bool:
            d = [0] * 10001
            for i in range(1, n + 1):
                d[i] += 1
                k = 2
                while k * i < len(d):
                    d[k * i] += 1
                    k += 1
            res = d[n] == 3
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert not sol.isThree(2)
    return


@app.cell
def __(sol):
    assert sol.isThree(4)
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
