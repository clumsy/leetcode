import marimo

__generated_with = "0.8.15"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2190](https://leetcode.com/problems/most-frequent-number-following-key-in-an-array)""")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def mostFrequent(self, nums: List[int], key: int) -> int:
            cnt = Counter()
            for i in range(len(nums) - 1):
                if nums[i] == key:
                    cnt[nums[i + 1]] += 1
            res = cnt.most_common(1)[0][0]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.mostFrequent([1,100,200,1,100], 1) == 100
    return


@app.cell
def __(sol):
    assert sol.mostFrequent([2,2,2,2,3], 2) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
