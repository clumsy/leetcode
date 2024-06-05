import marimo

__generated_with = "0.6.14"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 349](https://leetcode.com/problems/intersection-of-two-arrays)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
            nums1.sort()
            nums2.sort()
            n, m = len(nums1), len(nums2)
            res = []
            i, j = 0, 0
            for i in range(n):
                if i > 0 and nums1[i] == nums1[i - 1]:
                    continue
                while j < m and nums2[j] < nums1[i]:
                    j += 1
                if j < m and nums1[i] == nums2[j]:
                    res.append(nums1[i])
                    while j < m and nums2[j] == nums2[j - 1]:
                        j += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.intersection([1,2,2,1], [2,2]) == [2]
    return


@app.cell
def __(sol):
    assert sol.intersection([4,9,5], [9,4,9,8,4]) == [4,9]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
