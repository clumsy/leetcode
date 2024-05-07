import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3029](https://leetcode.com/problems/minimum-time-to-revert-word-to-initial-state-i)")
    return


@app.cell
def __():
    class Solution2:
        def minimumTimeToInitialState(self, w: str, k: int) -> int:
            n, res = len(w), 1
            for i in range(k, n, k):
                if w.startswith(w[i:]):
                    break
                res += 1
            return res
    return Solution2,


@app.cell
def __():
    class Solution:
        def minimumTimeToInitialState(self, w: str, k: int) -> int:
            n = len(w)
            p, x = [0] * n, 0
            for i in range(1, n):
                while x and w[i] != w[x]:
                    x = p[x - 1]
                x = p[i] = x + (w[i] == w[x])
            while x and (n - x) % k > 0:
                x = p[x - 1]
            res = (n - x + k - 1) // k
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumTimeToInitialState("abacaba", 3) == 2
    return


@app.cell
def __(sol):
    assert sol.minimumTimeToInitialState("abacaba", 4) == 1
    return


@app.cell
def __(sol):
    assert sol.minimumTimeToInitialState("abcbabcd", 2) == 4
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
