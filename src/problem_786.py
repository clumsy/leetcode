import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 786](https://leetcode.com/problems/k-th-smallest-prime-fraction)")
    return


@app.cell
def __():
    from typing import List
    from heapq import heappop, heappush
    return List, heappop, heappush


@app.cell
def __(List, heappop, heappush):
    class Solution:
        def kthSmallestPrimeFraction(self, arr: List[int], k: int) -> List[int]:
            h, n = [], len(arr)
            for i in range(n):
                for j in reversed(range(i + 1, n)):
                    v = arr[i] / arr[j]
                    if len(h) == k:
                        if h and v > -h[0][0]:
                            break
                        heappop(h)
                    heappush(h, (-v, arr[i], arr[j]))
            res = list(h[0][1:])
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.kthSmallestPrimeFraction([1,2,3,5], 3) == [2,5]
    return


@app.cell
def __(sol):
    assert sol.kthSmallestPrimeFraction([1,7], 1) == [1,7]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
