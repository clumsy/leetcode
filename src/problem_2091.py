import marimo

__generated_with = "0.4.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2091](https://leetcode.com/problems/removing-minimum-and-maximum-from-array)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minimumDeletions(self, nums: List[int]) -> int:
            n, mi, ma = len(nums), 0, 0
            for i in range(n):
                if nums[i] < nums[mi]:
                    mi = i
                if nums[i] > nums[ma]:
                    ma = i
            mi, ma = (ma, mi) if ma < mi else (mi, ma)
            res = min(max(mi + 1, ma + 1), max(n - ma, n - mi), mi + 1 + n - ma)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumDeletions([2,10,7,5,4,1,8,6]) == 5
    return


@app.cell
def __(sol):
    assert sol.minimumDeletions([0,-4,19,1,8,-2,-3,5]) == 3
    return


@app.cell
def __(sol):
    assert sol.minimumDeletions([101]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
