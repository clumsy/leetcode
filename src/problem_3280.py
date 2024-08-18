import marimo

__generated_with = "0.8.13"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3280](https://leetcode.com/problems/convert-date-to-binary)""")
    return


@app.cell
def __():
    class Solution:
        def convertDateToBinary(self, d: str) -> str:
            def to_bin(i):
                b = []
                while i:
                    i, r = divmod(i, 2)
                    b.append(r)
                b.reverse()
                return "".join(str(c) for c in b)
            res = "-".join(to_bin(int(i)) for i in d.split("-"))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.convertDateToBinary("2080-02-29") == "100000100000-10-11101"
    return


@app.cell
def __(sol):
    assert sol.convertDateToBinary("1900-01-01") == "11101101100-1-1"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
