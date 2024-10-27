import marimo

__generated_with = "0.9.14"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2367](https://leetcode.com/problems/number-of-arithmetic-triplets)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def arithmeticTriplets(self, nums: List[int], diff: int) -> int:
            n, res, j, k = len(nums), 0, 1, 2
            for i in range(n - 2):
                while k < n and nums[k] < nums[i] + diff * 2:
                    k += 1
                while j < k and nums[j] < nums[i] + diff:
                    j += 1
                res += j < k < n and nums[k] - nums[j] == nums[j] - nums[i] == diff
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.arithmeticTriplets([0,1,4,6,7,10], 3) == 2
    return


@app.cell
def __(sol):
    assert sol.arithmeticTriplets([4,5,6,7,8,9], 2) == 2
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
