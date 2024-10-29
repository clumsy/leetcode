import marimo

__generated_with = "0.9.14"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2379](https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks)""")
    return


@app.cell
def __():
    class Solution:
        def minimumRecolors(self, blocks: str, k: int) -> int:
            cur = res = blocks[:k].count("W")
            for i in range(k, len(blocks)):
                cur += blocks[i] == "W"
                cur -= blocks[i - k] == "W"
                res = min(res, cur)
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minimumRecolors("WBBWWBBWBW", 7) == 3
    return


@app.cell
def __(sol):
    assert sol.minimumRecolors("WBWBBBW", 2) == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
