import marimo

__generated_with = "0.9.11"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2383](https://leetcode.com/problems/minimum-hours-of-training-to-win-a-competition)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def minNumberOfHours(self, initialEnergy: int, initialExperience: int, energy: List[int], experience: List[int]) -> int:
            res, nrj, n = 0, 0, len(energy)
            for i in range(n):
                nrj += energy[i]
                res += max(0, experience[i] - initialExperience - res + 1)
                initialExperience += experience[i]
            res += max(0, nrj - initialEnergy + 1)
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minNumberOfHours(5, 3, [1,4,3,2], [2,6,3,1]) == 8
    return


@app.cell
def __(sol):
    assert sol.minNumberOfHours(2, 4, [1], [3]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
