import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2780](https://leetcode.com/problems/minimum-index-of-a-valid-split)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minimumIndex(self, nums: List[int]) -> int:
            dom = nums[0]
            cnt, n = 1, len(nums)
            for i in nums[1:]:
                cnt += 1 if i == dom else -1
                if cnt < 0:
                    dom = i
                    cnt = 1
            cnt = sum(i == dom for i in nums)
            cur, res = 0, -1
            for i, e in enumerate(nums):
                cur += e == dom
                if 2 * cur > i + 1 and 2 * (cnt - cur) > n - 1 - i:
                    res = i
                    break
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumIndex([1,2,2,2]) == 2
    return


@app.cell
def __(sol):
    assert sol.minimumIndex([2,1,3,1,1,1,7,1,2,1]) == 4
    return


@app.cell
def __(sol):
    assert sol.minimumIndex([3,3,3,3,7,2,2]) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
