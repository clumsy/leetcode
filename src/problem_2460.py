import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2460](https://leetcode.com/problems/apply-operations-to-an-array)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def applyOperations(self, nums: List[int]) -> List[int]:
            n = len(nums)
            for i in range(n):
                if i < n - 1 and nums[i] == nums[i + 1]:
                    nums[i] *= 2
                    nums[i + 1] = 0
            i = 0
            for num in nums:
                if num > 0:
                    nums[i] = num
                    i += 1
            for j in range(i, n):
                nums[j] = 0
            return nums
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.applyOperations([1,2,2,1,1,0]) == [1,4,2,0,0,0]
    return


@app.cell
def __(sol):
    assert sol.applyOperations([0,1]) == [1,0]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
