import marimo

__generated_with = "0.4.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2023](https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target)""")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def numOfPairs(self, nums: List[str], target: str) -> int:
            res, cnt = 0, Counter(nums)
            for s, c in cnt.items():
                if target.startswith(s):
                    other = target[len(s):]
                    res += (c - (s == other)) * cnt[other]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numOfPairs(["777","7","77","77"], "7777") == 4
    return


@app.cell
def __(sol):
    assert sol.numOfPairs(["123","4","12","34"], "1234") == 2
    return


@app.cell
def __(sol):
    assert sol.numOfPairs(["1","1","1"], "11") == 6
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
