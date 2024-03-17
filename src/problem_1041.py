import marimo

__generated_with = "0.3.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1041](https://leetcode.com/problems/robot-bounded-in-circle)")
    return


@app.cell
def __():
    class Solution:
        def isRobotBounded(self, instructions: str) -> bool:
            x = y = 0
            dx, dy = 0, 1
            for i in instructions:
                if i == "L":
                    if dx == 0 and dy > 0:
                        dx, dy = -dy, 0
                    elif dx < 0 and dy == 0:
                        dx, dy = 0, dx
                    elif dx == 0 and dy < 0:
                        dx, dy = -dy, 0
                    elif dx > 0 and dy == 0:
                        dx, dy = 0, dx
                elif i == "R":
                    if dx == 0 and dy > 0:
                        dx, dy = dy, 0
                    elif dx < 0 and dy == 0:
                        dx, dy = 0, -dx
                    elif dx == 0 and dy < 0:
                        dx, dy = dy, 0
                    elif dx > 0 and dy == 0:
                        dx, dy = 0, -dx
                else:
                    x += dx
                    y += dy
            res = (x == 0 and y == 0) or dy <= 0
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isRobotBounded("GGLLGG")
    return


@app.cell
def __(sol):
    assert not sol.isRobotBounded("GG")
    return


@app.cell
def __(sol):
    assert sol.isRobotBounded("GL")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
