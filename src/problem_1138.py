import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1138](https://leetcode.com/problems/alphabet-board-path)")
    return


@app.cell
def __():
    import string
    return string,


@app.cell
def __(string):
    class Solution:
        def alphabetBoardPath(self, t: str) -> str:
            m = {c: (i // 5, i % 5) for i, c in enumerate(string.ascii_lowercase)}
            res, cur = [], "a"
            for c in t:
                p1, p2 = m[cur], m[c]
                dx, dy = p2[0] - p1[0], p2[1] - p1[1]
                if dy < 0:
                    res.append("L" * (-dy))
                if dx < 0:
                    res.append("U" * (-dx))
                if dx > 0:
                    res.append("D" * (+dx))
                if dy > 0:
                    res.append("R" * (+dy))
                res.append("!")
                cur = c
            res = "".join(res)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.alphabetBoardPath("leet") == "DDR!UURRR!!DDD!"
    return


@app.cell
def __(sol):
    assert sol.alphabetBoardPath("code") == "RR!DDRR!LUU!R!"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
