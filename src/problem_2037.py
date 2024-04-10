import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2037](https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minMovesToSeat(self, seats: List[int], students: List[int]) -> int:
            seats.sort()
            students.sort()
            res = sum(abs(i - j) for i, j in zip(seats, students))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minMovesToSeat([3,1,5], [2,7,4]) == 4
    return


@app.cell
def __(sol):
    assert sol.minMovesToSeat([4,1,5,9], [1,3,2,6]) == 7
    return


@app.cell
def __(sol):
    assert sol.minMovesToSeat([2,2,6,6], [1,3,2,6]) == 4
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
