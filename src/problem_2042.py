import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2042](https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence)")
    return


@app.cell
def __():
    class Solution:
        def areNumbersAscending(self, s: str) -> bool:
            ma, res = 0, True
            for w in s.split():
                if w.isnumeric():
                    nxt = int(w)
                    if nxt <= ma:
                        res = False
                        break
                    ma = nxt
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles")
    return


@app.cell
def __(sol):
    assert not sol.areNumbersAscending("hello world 5 x 5")
    return


@app.cell
def __(sol):
    assert not sol.areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
