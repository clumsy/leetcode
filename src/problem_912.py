import marimo

__generated_with = "0.5.1"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 912](https://leetcode.com/problems/sort-an-array)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List, randint):
    class Solution2:
        def sortArray(self, nums: List[int]) -> List[int]:
            def partition(arr, lo, hi):
                p = randint(lo, hi)
                arr[p], arr[hi], p = arr[hi], arr[p], hi
                while lo < hi:
                    while lo < hi and arr[lo] < arr[p]:
                        lo += 1
                    while lo < hi and arr[hi] >= arr[p]:
                        hi -= 1
                    if lo < hi:
                        arr[lo], arr[hi] = arr[hi], arr[lo]
                arr[p], arr[hi] = arr[hi], arr[p]
                return hi

            def insertionsort(arr, lo, hi):
                for i in range(lo, hi):
                    for j in range(i + 1, hi + 1):
                        if arr[i] > arr[j]:
                            arr[i], arr[j] = arr[j], arr[i]
                return arr

            def quicksort(arr, lo, hi):
                if lo >= hi:
                    return
                if hi - lo < 7:
                    return insertionsort(arr, lo, hi)
                p = partition(arr, lo, hi)
                quicksort(arr, lo, p - 1)
                quicksort(arr, p + 1, hi)

            quicksort(nums, 0, len(nums) - 1)
            return nums
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def sortArray(self, nums: List[int]) -> List[int]:
            def sink(arr, i, n):
                while 2 * i + 1 < n:
                    c = 2 * i + 1
                    if c + 1 < n and arr[c + 1] > arr[c]:
                        c += 1
                    if arr[i] >= arr[c]:
                        break
                    arr[c], arr[i] = arr[i], arr[c]
                    i = c

            def heapify(arr):
                n = len(arr)
                for i in reversed(range(n // 2)):
                    sink(arr, i, n)

            def heapsort(arr):
                heapify(arr)
                n = len(arr)
                for i in reversed(range(1, n)):
                    arr[i], arr[0] = arr[0], arr[i]
                    sink(arr, 0, i)

            heapsort(nums)
            return nums
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.sortArray([5,2,3,1]) == [1,2,3,5]
    return


@app.cell
def __(sol):
    assert sol.sortArray([5,1,1,2,0,0]) == [0,0,1,1,2,5]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
