import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3080](https://leetcode.com/problems/mark-elements-on-array-by-performing-queries)")
    return


@app.cell
def __():
    from typing import List
    from heapq import heapify, heappop, heappush
    return List, heapify, heappop, heappush


@app.cell
def __(List, heapify, heappop):
    class Solution:
        def unmarkedSumArray(self, nums: List[int], queries: List[List[int]]) -> List[int]:
            q = [(v, i) for i, v in enumerate(nums)]
            heapify(q)
            s, mkd = sum(nums), set()
            res = [0] * len(queries)
            for i, (idx, k) in enumerate(queries):
                if idx not in mkd:
                    mkd.add(idx)
                    s -= nums[idx]
                while k and q:
                    v, idx = heappop(q)
                    if idx not in mkd:
                        mkd.add(idx)
                        s -= v
                        k -= 1
                res[i] = s
                if not q:
                    break
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.unmarkedSumArray([1,2,2,1,2,3,1], [[1,2],[3,3],[4,2]]) == [8,3,0]
    return


@app.cell
def __(sol):
    assert sol.unmarkedSumArray([1,4,2,3], [[0,1]]) == [7]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
