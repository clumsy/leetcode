import marimo

__generated_with = "0.9.1"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3179](https://leetcode.com/problems/find-the-n-th-value-after-k-seconds)""")
    return


@app.cell
def __():
    class Solution2:
        def valueAfterKSeconds(self, n: int, k: int) -> int:
            #1a0 1a1 1a2 1a3
            #1a0 1a0+1a1 1a0+1a1+1a2  1a0+1a1+1a2+1a3
            #1a0 2a0+1a1 3a0+2a1+1a2  4a0+3a2+2a2+1a3
            #1a0 3a0+1a1 6a0+3a1+1a2  10a0+6a2+3a2+1a3
            #1a0 4a0+1a1 10a0+4a1+1a2 20a0+10a2+4
            N, K = n - 1 + k - 1, n - 1
            fac = {0: 1}
            for i in range(1, N + 1):
                fac[i] = fac[i - 1] * i
            res = 0
            for i in range(n):
                b = fac[N - i] // (fac[K - i] * fac[N - K])
                res = (res + b) % 1_000_000_007
            return res
    return (Solution2,)


@app.cell
def __():
    class Solution:
        def valueAfterKSeconds(self, n: int, k: int) -> int:
            res = 1
            for i in range(min(k, n - 1)):
                res = res * (n - 1 + k - i) // (i + 1)
            return res % 1_000_000_007
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.valueAfterKSeconds(4, 5) == 56
    return


@app.cell
def __(sol):
    assert sol.valueAfterKSeconds(5, 3) == 35
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
