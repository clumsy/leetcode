import marimo

__generated_with = "0.3.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3074](https://leetcode.com/problems/apple-redistribution-into-boxes)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minimumBoxes(self, apple: List[int], capacity: List[int]) -> int:
            a = sum(apple)
            capacity.sort(reverse=True)
            res = 0
            for c in capacity:
                res += 1
                a -= c
                if a <= 0:
                    break
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumBoxes([1,3,2], [4,3,1,5,2]) == 2
    return


@app.cell
def __(sol):
    assert sol.minimumBoxes([5,5,5], [2,4,2,7]) == 4
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
