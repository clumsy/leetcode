import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2469](https://leetcode.com/problems/convert-the-temperature)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def convertTemperature(self, celsius: float) -> List[float]:
            res = [celsius + 273.15, celsius * 1.8 + 32]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.convertTemperature(36.50) == [309.65000,97.70000]
    return


@app.cell
def __(sol):
    assert sol.convertTemperature(122.11) == [395.26000,251.79800]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
