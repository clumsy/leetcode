import marimo

__generated_with = "0.9.14"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2358](https://leetcode.com/problems/maximum-number-of-groups-entering-a-competition)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def maximumGroups(self, grades: List[int]) -> int:
            res, i, n = 0, 0, len(grades)
            while i < n - res:
                res += 1
                i += res
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.maximumGroups([10,6,12,7,3,5]) == 3
    return


@app.cell
def __(sol):
    assert sol.maximumGroups([8,8]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
