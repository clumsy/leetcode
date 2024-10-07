import marimo

__generated_with = "0.9.1"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2317](https://leetcode.com/problems/maximum-xor-after-operations)""")
    return


@app.cell
def __():
    from typing import List
    from operator import ior
    from functools import reduce
    return List, ior, reduce


@app.cell
def __(List, ior, reduce):
    class Solution:
        def maximumXOR(self, nums: List[int]) -> int:
            #  11   11
            #  10   10
            # 100  100
            # 110   10

            #    1
            #   10
            #   10
            #   11
            # 1001

            # i and (i ^ x) = i - (i and x)
            # this means we can always make odd number of numbers with kth bit on
            # if we have at least one number with it

            res = reduce(ior, nums)
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.maximumXOR([3,2,6,4]) == 7
    return


@app.cell
def __(sol):
    assert sol.maximumXOR([1,2,3,9,2]) == 11
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
