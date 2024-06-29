import marimo

__generated_with = "0.6.24"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3184](https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def countCompleteDayPairs(self, hours: List[int]) -> int:
            cnt = Counter(h % 24 for h in hours)
            res = sum(cnt[i] * cnt[24 - i] for i in cnt if 0 < i < 12)
            res += (cnt[12] - 1) * cnt[12] // 2
            res += (cnt[0] - 1) * cnt[0] // 2
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countCompleteDayPairs([12,12,30,24,24]) == 2
    return


@app.cell
def __(sol):
    assert sol.countCompleteDayPairs([72,48,24,3]) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
