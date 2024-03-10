import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2433](https://leetcode.com/problems/find-the-original-array-of-prefix-xor)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def findArray(self, pref: List[int]) -> List[int]:
            # p0 = x0
            # p1 = x0 ^ x1 => p1 ^ p0 = x0 ^ x0 ^ x1 = x1
            for i in range(len(pref) - 1, -1 , -1):
                pref[i] = pref[i] ^ (pref[i - 1] if i > 0 else 0)
            res = pref
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findArray([5,2,0,3,1]) == [5,7,2,3,2]
    return


@app.cell
def __(sol):
    assert sol.findArray([13]) == [13]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
