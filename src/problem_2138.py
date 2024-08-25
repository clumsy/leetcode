import marimo

__generated_with = "0.8.15"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2138](https://leetcode.com/problems/divide-a-string-into-groups-of-size-k)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def divideString(self, s: str, k: int, fill: str) -> List[str]:
            n = len(s)
            s += fill * (k - 1)
            res = [s[k * i : k * i + k] for i in range((n + k - 1) // k)]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.divideString("abcdefghi", 3, "x") == ["abc","def","ghi"]
    return


@app.cell
def __(sol):
    assert sol.divideString("abcdefghij", 3, "x") == ["abc","def","ghi","jxx"]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
