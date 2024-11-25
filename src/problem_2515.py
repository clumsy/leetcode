import marimo

__generated_with = "0.9.23"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2515](https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def closetTarget(self, words: List[str], target: str, startIndex: int) -> int:
            n, i = len(words), 0
            while i < n:
                if words[(startIndex + i) % n] == target or words[(startIndex - i) % n] == target:
                    break
                i += 1
            res = i if i != n else -1
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.closetTarget(["hello","i","am","leetcode","hello"], "hello", 1) == 1
    return


@app.cell
def __(sol):
    assert sol.closetTarget(["a","b","leetcode"], "leetcode", 0) == 1
    return


@app.cell
def __(sol):
    assert sol.closetTarget(["i","eat","leetcode"], "ate", 0) == -1
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
