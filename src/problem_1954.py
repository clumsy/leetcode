import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1954](https://leetcode.com/problems/minimum-garden-perimeter-to-collect-enough-apples)")
    return


@app.cell
def __():
    class Solution:
        def minimumPerimeter(self, neededApples: int) -> int:
            # 3 4 5 6
            # 2 3 4 5
            # 1 2 3 4
            # 0 1 2 3
            i = 0
            while neededApples > 0:
                i += 1
                neededApples -= 4 * (i + 2 * i) + 8 * ((i + 1 + 2*i - 1) * (2*i - i - 1)) // 2
            res = 4 * 2 * i
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumPerimeter(1) == 8
    return


@app.cell
def __(sol):
    assert sol.minimumPerimeter(13) == 16
    return


@app.cell
def __(sol):
    assert sol.minimumPerimeter(1000000000) == 5040
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
