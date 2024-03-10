import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2424](https://leetcode.com/problems/longest-uploaded-prefix)")
    return


@app.cell
def __():
    class LUPrefix2:

        def __init__(self, n: int):
            self.prnt = [-1] * n
            self.size = [0] * n

        def _find(self, i):
            while i != self.prnt[i]:
                i = self._find(self.prnt[i])
            return self.prnt[i]
        
        def _union(self, x, y):
            if x < 0 or y >= len(self.prnt):
                return
            if self.prnt[x] < 0 or self.prnt[y] < 0:
                return
            px, py = self._find(x), self._find(y)
            if px != py:
                self.prnt[py] = px
                self.size[px] += self.size[py]

        def upload(self, v: int) -> None:
            v -= 1
            self.prnt[v] = v
            self.size[v] = 1
            self._union(v - 1, v)
            self._union(v, v + 1)

        def longest(self) -> int:
            return self.size[0]
    return LUPrefix2,


@app.cell
def __():
    class LUPrefix:

        def __init__(self, n: int):
            self.psnt = set()
            self.lgst = 0

        def upload(self, v: int) -> None:
            self.psnt.add(v)

        def longest(self) -> int:
            while self.lgst + 1 in self.psnt:
                self.lgst += 1
            return self.lgst
    return LUPrefix,


@app.cell
def __(LUPrefix):
    sol = LUPrefix(4)
    sol.upload(3)
    assert sol.longest() == 0
    sol.upload(1)
    assert sol.longest() == 1
    sol.upload(2)
    assert sol.longest() == 3
    return sol,


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
