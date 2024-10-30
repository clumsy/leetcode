import marimo

__generated_with = "0.9.14"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2375](https://leetcode.com/problems/construct-smallest-number-from-di-string)""")
    return


@app.cell
def __():
    class Solution:
        def smallestNumber(self, pattern: str) -> str:
            res = [None] * (len(pattern) + 1)
            cur, d = 1, 0
            for i, c in enumerate(pattern):
                if c == "I":
                    nxt = cur + d + 1
                    while d:
                        res[i - d] = cur + d
                        d -= 1
                    res[i], cur = cur, nxt
                else:
                    d += 1
            i += 1
            while d >= 0:
                res[i - d] = cur + d
                d -= 1
            res = "".join(str(i) for i in res)
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.smallestNumber("IIIDIDDD") == "123549876"
    return


@app.cell
def __(sol):
    assert sol.smallestNumber("DDD") == "4321"
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
