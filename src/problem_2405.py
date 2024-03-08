import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2405](https://leetcode.com/problems/optimal-partition-of-string)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def partitionString(self, s: str) -> int:
            res, cnt = 1, Counter()
            for c in s:
                if cnt[c] > 0:
                    cnt.clear()
                    res += 1
                cnt[c] += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.partitionString("abacaba") == 4
    return


@app.cell
def __(sol):
    assert sol.partitionString("ssssss") == 6
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
