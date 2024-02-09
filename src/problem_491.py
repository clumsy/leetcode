import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 491](https://leetcode.com/problems/non-decreasing-subsequences/description)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution2:
        def findSubsequences(self, nums: List[int]) -> List[List[int]]:
            n = len(nums)
            res = set()
            for mask in range(1 << n):
                if mask - (mask & (-mask)) == 0:
                    continue
                cur = []
                for i in range(n):
                    if mask & (1 << i) == 0:
                        continue
                    if cur and nums[i] < cur[-1]:
                        break
                    cur.append(nums[i])
                else:
                    res.add(tuple(cur))
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def findSubsequences(self, nums: List[int]) -> List[List[int]]:
            n = len(nums)
            res = set()
            def dfs(cur=[], i=-1):
                for j in range(i + 1, n):
                    if not cur or nums[j] >= cur[-1]:
                        cur.append(nums[j])
                        if len(cur) > 1:
                            res.add(tuple(cur))
                        dfs(cur, j)
                        cur.pop()
            dfs()
            print(res)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findSubsequences([4,6,7,7]) == {(7,7),(4,6),(4,7,7),(6,7),(6,7,7),(4,6,7),(4,6,7,7),(4,7)}
    return


@app.cell
def __(sol):
    assert sol.findSubsequences([4,4,3,2,1]) == {(4,4)}
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
