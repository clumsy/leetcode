import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 930](https://leetcode.com/problems/binary-subarrays-with-sum)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution1:
        def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:
            cnt = Counter()
            cnt[0] = 1
            res = cur = 0
            for i in nums:
                cur += i
                res += cnt.get(cur - goal, 0)
                cnt[cur] += 1
            return res
    return Solution1,


@app.cell
def __(List):
    class Solution2:
        def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:
            n = len(nums)
            res = cur = s = b = 0
            for e in range(n):
                cur += nums[e]
                while s < e and cur > goal:
                    cur -= nums[s]
                    s += 1
                b = max(b, s)
                while b < e and cur - nums[b] >= goal:
                    cur -= nums[b]
                    b += 1
                res += b - s + 1 if cur == goal else 0
                # print(s, b, e, cur, res)
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:
            def at_most(x):
                if x < 0:
                    return 0
                res = b = 0
                for e in range(len(nums)):
                    x -= nums[e]
                    while x < 0:
                        x += nums[b]
                        b += 1
                    res += e - b + 1
                return res
            res = at_most(goal) - at_most(goal - 1)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numSubarraysWithSum([1,0,1,0,1], 2) == 4
    return


@app.cell
def __(sol):
    assert sol.numSubarraysWithSum([0,0,0,0,0], 0) == 15
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
