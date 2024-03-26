import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3079](https://leetcode.com/problems/find-the-sum-of-encrypted-integers)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def sumOfEncryptedInt(self, nums: List[int]) -> int:
            def encrypt(i):
                s = str(i)
                return int(max(s) * len(s))
            res = sum(encrypt(i) for i in nums)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.sumOfEncryptedInt([1,2,3]) == 6
    return


@app.cell
def __(sol):
    assert sol.sumOfEncryptedInt([10,21,31]) == 66
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
