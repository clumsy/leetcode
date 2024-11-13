import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2799](https://leetcode.com/problems/count-complete-subarrays-in-an-array)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def countCompleteSubarrays(self, nums: List[int]) -> int:
            res = i = 0
            cnt, n = len(set(nums)), len(nums)
            cur = Counter()
            for j in range(n):
                cur[nums[j]] += 1
                while len(cur) == cnt:
                    cur[nums[i]] -= 1
                    if cur[nums[i]] == 0:
                        del cur[nums[i]]
                    i += 1
                res += i
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countCompleteSubarrays([1,3,1,2,2]) == 4
    return


@app.cell
def __(sol):
    assert sol.countCompleteSubarrays([5,5,5,5]) == 10
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
