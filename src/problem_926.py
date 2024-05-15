import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 926](https://leetcode.com/problems/flip-string-to-monotone-increasing)")
    return


@app.cell
def __():
    class Solution:
        def minFlipsMonoIncr(self, s: str) -> int:
            res = ones = 0
            for d in s:
                if d == "1":
                    ones += 1
                elif ones:
                    ones -= 1
                    # we either count all ones to be flipped
                    # or zeroes if their count is less than ones
                    res += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minFlipsMonoIncr("00110") == 1
    return


@app.cell
def __(sol):
    assert sol.minFlipsMonoIncr("010110") == 2
    return


@app.cell
def __(sol):
    assert sol.minFlipsMonoIncr("00011000") == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
