import marimo

__generated_with = "0.6.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 933](https://leetcode.com/problems/number-of-recent-calls)")
    return


@app.cell
def __():
    from collections import deque
    return deque,


@app.cell
def __(deque):
    class RecentCounter:

        def __init__(self):
            self.q = deque()


        def ping(self, t: int) -> int:
            while self.q and t - self.q[0] > 3000:
                self.q.popleft()
            self.q.append(t)
            res = len(self.q)
            return res
    return RecentCounter,


@app.cell
def __(RecentCounter):
    sol = RecentCounter()
    assert sol.ping(1) == 1
    assert sol.ping(100) == 2
    assert sol.ping(3001) == 3
    assert sol.ping(3002) == 3
    return sol,


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
