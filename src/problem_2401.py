import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2401](https://leetcode.com/problems/longest-nice-subarray)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution2:
        def longestNiceSubarray(self, nums: List[int]) -> int:
            def count(e):
                cnt, i = set(), 0
                while e >= (1 << i):
                    if e & (1 << i) > 0:
                        cnt.add(i)
                    i += 1
                return cnt
            res = cur = 0
            cnt = set()
            for i, e in enumerate(nums):
                cnt_e = count(e)
                while cnt & cnt_e:
                    cnt -= count(nums[i - cur])
                    cur -= 1
                cnt |= cnt_e
                cur += 1
                res = max(res, cur)
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def longestNiceSubarray(self, nums: List[int]) -> int:
            res = cur = used = 0
            for i, e in enumerate(nums):
                while used & e:
                    used ^= nums[i - cur]
                    cur -= 1
                used |= e
                cur += 1
                res = max(res, cur)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.longestNiceSubarray([1,3,8,48,10]) == 3
    return


@app.cell
def __(sol):
    assert sol.longestNiceSubarray([3,1,5,11,13]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
