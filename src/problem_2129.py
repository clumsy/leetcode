import marimo

__generated_with = "0.8.19"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2129](https://leetcode.com/problems/capitalize-the-title)""")
    return


@app.cell
def __():
    class Solution:
        def capitalizeTitle(self, title: str) -> str:
            res = " ".join(w.lower() if len(w) < 3 else w.title() for w in title.split())
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.capitalizeTitle("capiTalIze tHe titLe") == "Capitalize The Title"
    return


@app.cell
def __(sol):
    assert sol.capitalizeTitle("First leTTeR of EACH Word") == "First Letter of Each Word"
    return


@app.cell
def __(sol):
    assert sol.capitalizeTitle("i lOve leetcode") == "i Love Leetcode"
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
