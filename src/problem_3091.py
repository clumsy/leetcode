import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3091](https://leetcode.com/problems/apply-operations-to-make-sum-of-array-greater-than-or-equal-to-k)")
    return


@app.cell
def __():
    class Solution:
        def minOperations(self, k: int) -> int:
            prv = cur = k
            m = 1
            while k > m and cur <= prv:
                m += 1
                prv, cur = cur, m - 1 + (k - m + m - 1) // m
            m -= k != 1
            res = m - 1 + (k - m + m - 1) // m
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minOperations(11) == 5
    return


@app.cell
def __(sol):
    assert sol.minOperations(1) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
