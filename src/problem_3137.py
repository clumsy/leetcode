import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3137](https://leetcode.com/problems/minimum-number-of-operations-to-make-word-k-periodic)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def minimumOperationsToMakeKPeriodic(self, w: str, k: int) -> int:
            n = len(w)
            cnt = Counter(w[i:i + k] for i in range(0, n, k))
            res = n // k - max(cnt.values())
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumOperationsToMakeKPeriodic("leetcodeleet", 4) == 1
    return


@app.cell
def __(sol):
    assert sol.minimumOperationsToMakeKPeriodic("leetcoleet", 2) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
