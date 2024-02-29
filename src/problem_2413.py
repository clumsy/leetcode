import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2413](https://leetcode.com/problems/smallest-even-multiple)")
    return


@app.cell
def __():
    class Solution:
        def smallestEvenMultiple(self, n: int) -> int:
            res = (n * 2) // (2 if n & 1 == 0 else 1) # lcm = a * b / gcd(a, b)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.smallestEvenMultiple(5) == 10
    return


@app.cell
def __(sol):
    assert sol.smallestEvenMultiple(6) == 6
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
