import marimo

__generated_with = "0.9.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2395](https://leetcode.com/problems/find-subarrays-with-equal-sum)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def findSubarrays(self, nums: List[int]) -> bool:
            sums, n = set(), len(nums)
            for i in range(n - 1):
                before = len(sums)
                sums.add(nums[i] + nums[i + 1])
                if len(sums) == before:
                    return True
            return False
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.findSubarrays([4,2,4])
    return


@app.cell
def __(sol):
    assert not sol.findSubarrays([1,2,3,4,5])
    return


@app.cell
def __(sol):
    assert sol.findSubarrays([0,0,0])
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
