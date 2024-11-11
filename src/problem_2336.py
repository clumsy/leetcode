import marimo

__generated_with = "0.9.17"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2336](https://leetcode.com/problems/smallest-number-in-infinite-set)""")
    return


@app.cell
def __():
    from heapq import heappop, heappush
    return heappop, heappush


@app.cell
def __(heappop, heappush):
    class SmallestInfiniteSet:

        def __init__(self):
            self.full_start = 1
            self.heap = []
            self.s = set()  

        def popSmallest(self) -> int:
            if self.heap:
                num = heappop(self.heap)
                self.s.remove(num)
                return num
            num = self.full_start
            self.full_start += 1
            return num

        def addBack(self, num: int) -> None:
            if num < self.full_start and num not in self.s:
                heappush(self.heap, num)
                self.s.add(num)
    return (SmallestInfiniteSet,)


@app.cell
def __(SmallestInfiniteSet):
    sol = SmallestInfiniteSet()
    sol.addBack(2)
    assert sol.popSmallest() == 1
    assert sol.popSmallest() == 2
    assert sol.popSmallest() == 3
    sol.addBack(1)
    assert sol.popSmallest() == 1
    assert sol.popSmallest() == 4
    assert sol.popSmallest() == 5
    return (sol,)


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
