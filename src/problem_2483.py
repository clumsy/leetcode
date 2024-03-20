import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2483](https://leetcode.com/problems/minimum-penalty-for-a-shop)")
    return


@app.cell
def __():
    class Solution:
        def bestClosingTime(self, customers: str) -> int:
            res = 0
            mi = cnt = customers.count("Y")
            for i, c in enumerate(customers):
                # what if we close now?
                cnt += -1 if c == "Y" else 1
                if cnt < mi:
                    res, mi = i + 1, cnt
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.bestClosingTime("YYNY") == 2
    return


@app.cell
def __(sol):
    assert sol.bestClosingTime("NNNNN") == 0
    return


@app.cell
def __(sol):
    assert sol.bestClosingTime("YYYY") == 4
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
