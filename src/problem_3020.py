import marimo

__generated_with = "0.5.1"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3020](https://leetcode.com/problems/find-the-maximum-number-of-elements-in-subset)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution2:
        def maximumLength(self, nums: List[int]) -> int:
            cnt = Counter(nums)
            res = max(0, cnt[1] - (cnt[1] & 1 == 0))
            del cnt[1]
            for i in cnt:
                k, x, cur = 1, i, 0
                while c := cnt[x]:
                    k *= 2
                    x *= x
                    cur += 2
                    if c == 1:
                        break
                res = max(res, cur - 1)
            return res
    return Solution2,


@app.cell
def __(Counter, List):
    class Solution:
        def maximumLength(self, nums: List[int]) -> int:
            cnt = Counter(nums)
            res = max(1, cnt[1] - (cnt[1] & 1 == 0))
            nums.sort(reverse=True)
            dp = {}
            for i in nums:
                if i == 1 or cnt[i] < 2:
                    continue
                i2 = i * i
                if dp_i2 := dp.get(i2):
                    dp[i] = dp_i2 + 2
                elif i2 in cnt:
                    dp[i] = 3
                res = max(res, dp.get(i, 0))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumLength([5,4,1,2,2]) == 3
    return


@app.cell
def __(sol):
    assert sol.maximumLength([1,3,2,4]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
