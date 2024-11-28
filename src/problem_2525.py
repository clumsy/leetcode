import marimo

__generated_with = "0.9.26"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2525](https://leetcode.com/problems/categorize-box-according-to-criteria)""")
    return


@app.cell
def __():
    class Solution:
        def categorizeBox(self, l: int, w: int, h: int, m: int) -> str:
            bulky = max(l, w, h) >= 1e4 or l * w * h >= 1e9
            heavy = m >= 100
            if bulky and heavy:
                return "Both"
            if bulky:
                return "Bulky"
            if heavy:
                return "Heavy"
            return "Neither"
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.categorizeBox(1000, 35, 700, 300) == "Heavy"
    return


@app.cell
def __(sol):
    assert sol.categorizeBox(200, 50, 800, 50) == "Neither"
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
