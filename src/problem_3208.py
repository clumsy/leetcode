import marimo

__generated_with = "0.9.1"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3208](https://leetcode.com/problems/alternating-groups-ii)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def numberOfAlternatingGroups(self, cs: List[int], k: int) -> int:
            n = len(cs)
            s = cur = res = 0
            for i in range(n + k - 1):
                if cs[i % n] == cs[(i - 1) % n]:
                    cur = 0
                cur += 1
                res += cur >= k
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.numberOfAlternatingGroups([0,1,0,1,0], 3) == 3
    return


@app.cell
def __(sol):
    assert sol.numberOfAlternatingGroups([0,1,0,0,1,0,1], 6) == 2
    return


@app.cell
def __(sol):
    assert sol.numberOfAlternatingGroups([1,1,0,1], 4) == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
