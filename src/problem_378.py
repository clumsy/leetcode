import marimo

__generated_with = "0.6.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 378](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution3:
        def kthSmallest(self, matrix: List[List[int]], k: int) -> int:
            n = len(matrix)
            pos, mi = [0] * n, -1
            while k > 0:
                k -= 1
                if mi >= 0:
                    pos[mi] += 1
                    mi = -1
                for i in range(n):
                    if pos[i] < n and (mi < 0 or matrix[i][pos[i]] < matrix[mi][pos[mi]]):
                        mi = i
            res = matrix[mi][pos[mi]]
            return res
    return Solution3,


@app.cell
def __(List):
    class Solution2:
        def kthSmallest(self, matrix: List[List[int]], k: int) -> int:
            n = len(matrix)
            lo, hi = matrix[0][0], matrix[n - 1][n - 1]
            while lo < hi:
                mi = lo + (hi - lo) // 2
                cnt = 0
                for r in range(n):
                    for c in range(n):
                        cnt += matrix[r][c] > mi
                if cnt <= n**2 - k:
                    hi = mi
                else:
                    lo = mi + 1
            res = lo
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def kthSmallest(self, matrix: List[List[int]], k: int) -> int:
            n = len(matrix)

            def to_matrix(i):
                return divmod(i, n)

            def from_matrix(r, c):
                return r * n + c

            def partition(left, pivot, right):
                # place pivot in right
                rr, rc = to_matrix(right)
                pr, pc = to_matrix(pivot)
                matrix[rr][rc], matrix[pr][pc] = matrix[pr][pc], matrix[rr][rc]

                # find where elements >= pivot begin
                for i in range(left, right):
                    ir, ic = to_matrix(i)
                    if matrix[ir][ic] < matrix[rr][rc]:
                        pr, pc = to_matrix(left)
                        matrix[ir][ic], matrix[pr][pc] = matrix[pr][pc], matrix[ir][ic]
                        left += 1

                # place pivot to the right spot
                pr, pc = to_matrix(left)
                matrix[rr][rc], matrix[pr][pc] = matrix[pr][pc], matrix[rr][rc]
                return left


            def quickselect(left, right, p):
                if left == right:
                    return left
                pivot = left + (right - left) // 2
                i = partition(left, pivot, right)
                if i == p:
                    return i
                elif i > p:
                    return quickselect(left, i - 1, p)
                else:
                    return quickselect(i + 1, right, p)


            i = quickselect(0, n * n - 1, k - 1)
            r, c = to_matrix(i)
            res = matrix[r][c]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.kthSmallest([[1,5,9],[10,11,13],[12,13,15]], 8) == 13
    return


@app.cell
def __(sol):
    assert sol.kthSmallest([[-5]], 1) == -5
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
