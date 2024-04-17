import marimo

__generated_with = "0.3.12"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2053](https://leetcode.com/problems/kth-distinct-string-in-an-array)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def kthDistinct(self, arr: List[str], k: int) -> str:
            c = Counter(arr)
            for i in arr:
                k -= c[i] == 1
                if k == 0:
                    return i
            return ""
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.kthDistinct(["d","b","c","b","c","a"], 2) == "a"
    return


@app.cell
def __(sol):
    assert sol.kthDistinct(["aaa","aa","a"], 1) == "aaa"
    return


@app.cell
def __(sol):
    assert sol.kthDistinct(["a","b","a"], 3) == ""
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
