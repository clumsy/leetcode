import marimo

__generated_with = "0.8.19"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 2136](https://leetcode.com/problems/earliest-possible-day-of-full-bloom)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def earliestFullBloom(self, pt: List[int], gt: List[int]) -> int:
            # ....P.GGGB
            # ......P.GB
            # P.P..PGGGB
            # ...P...PGB
            # res = max(grow_time) + sum(plant_time) - sum(fillers)
            res = 0
            for g, p in sorted(zip(gt, pt)):
                res = max(res, g) + p
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.earliestFullBloom([1,4,3], [2,3,1]) == 9
    return


@app.cell
def __(sol):
    assert sol.earliestFullBloom([1,2,3,2], [2,1,2,1]) == 9
    return


@app.cell
def __(sol):
    assert sol.earliestFullBloom([1], [1]) == 2
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
