import marimo

__generated_with = "0.8.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2177](https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def sumOfThree(self, num: int) -> List[int]:
            # x + x + 1 + x + 2 = num
            # 3x = num - 3
            # x = (num - 3) // 3
            x, r = divmod(num - 3, 3)
            res = [] if r > 0 else [x, x + 1, x + 2]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.sumOfThree(33) == [10,11,12]
    return


@app.cell
def __(sol):
    assert sol.sumOfThree(4) == []
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
