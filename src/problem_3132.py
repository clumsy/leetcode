import marimo

__generated_with = "0.4.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3132](https://leetcode.com/problems/find-the-integer-added-to-array-ii)")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution2:
        def minimumAddedInteger(self, nums1: List[int], nums2: List[int], lft=2, dif=inf) -> int:
            nums1.sort()
            nums2.sort()
            return self.solve(nums1, nums2)

        def solve(self, nums1: List[int], nums2: List[int], lft=2, dif=inf) -> int:
            if not nums1:
                return dif if lft == 0 and not nums2 else inf
            res = inf
            if dif == inf and nums2:
                res = min(res, self.solve(nums1[1:], nums2[1:], lft, nums2[0] - nums1[0]))
            if lft:
                res = min(res, self.solve(nums1[1:], nums2, lft - 1, dif))
            if nums2 and nums2[0] - nums1[0] == dif:
                res = min(res, self.solve(nums1[1:], nums2[1:], lft, dif))
            return res
    return Solution2,


@app.cell
def __(List, inf):
    class Solution:
        def minimumAddedInteger(self, nums1: List[int], nums2: List[int], lft=2, dif=inf) -> int:
            nums1.sort()
            nums2.sort()
            res = inf
            for cnt in range(3):
                diff = nums2[0] - nums1[cnt]
                for i in range(cnt + 1, len(nums1)):
                    if i - cnt >= len(nums2) or nums2[i - cnt] - nums1[i] != diff:
                        cnt += 1
                    if cnt > 2:
                        break
                res = min(res, diff if cnt == 2 else inf)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumAddedInteger([4,20,16,12,8], [14,18,10]) == -2
    return


@app.cell
def __(sol):
    assert sol.minimumAddedInteger([3,5,5,3], [7,7]) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
