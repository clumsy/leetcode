import marimo

__generated_with = "0.3.12"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2078](https://leetcode.com/problems/two-furthest-houses-with-different-colors)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maxDistance(self, colors: List[int]) -> int:
            n = len(colors)
            right = n - 1
            while right >= 0 and colors[0] == colors[right]:
                right -= 1
            left = 0
            while left < n and colors[left] == colors[n - 1]:
                left += 1
            return max(right, n - 1 - left)
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxDistance([1,1,1,6,1,1,1]) == 3
    return


@app.cell
def __(sol):
    assert sol.maxDistance([1,8,3,8,3]) == 4
    return


@app.cell
def __(sol):
    assert sol.maxDistance([0,1]) == 1
    return


@app.cell
def __(sol):
    assert sol.maxDistance([6,6,6,6,6,6,6,6,6,19,19,6,6]) == 10
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
