import marimo

__generated_with = "0.8.15"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 732](https://leetcode.com/problems/my-calendar-iii)""")
    return


@app.cell
def __():
    from bisect import insort
    return insort,


@app.cell
def __(insort):
    class MyCalendarThree2:
        def __init__(self):
            self.cnt = []
            
        def book(self, s: int, e: int) -> int:
            insort(self.cnt, (s, 1))
            insort(self.cnt, (e, -1))
            cur = res = 0
            for _, e in self.cnt:
                cur += e
                res = max(res, cur)
            return res
    return MyCalendarThree2,


@app.cell
def __():
    from collections import defaultdict
    return defaultdict,


@app.cell
def __(defaultdict):
    class MyCalendarThree:
        def __init__(self):
            self.sgmt = defaultdict(int)
            self.lazy = defaultdict(int)
            
        def book(self, s: int, e: int) -> int:
            def update(s, e, l=0, r=10**9, i=1):
                if r <= s or l >= e:
                    return
                if s <= l < r <= e:
                    self.sgmt[i] += 1
                    self.lazy[i] += 1
                    return
                m = (l + r) // 2
                update(s, e, l=l, r=m, i=2 * i)
                update(s, e, l=m, r=r, i=2 * i + 1)
                self.sgmt[i] = self.lazy[i] + max(self.sgmt[2 * i], self.sgmt[2 * i + 1]) 
            update(s, e)
            res = self.sgmt[1]
            return res
    return MyCalendarThree,


@app.cell
def __(MyCalendarThree):
    sol = MyCalendarThree()
    assert sol.book(10, 20) == 1
    assert sol.book(50, 60) == 1
    assert sol.book(10, 40) == 2
    assert sol.book(5, 15) == 3
    assert sol.book(5, 10) == 3
    assert sol.book(25, 55) == 3
    return sol,


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
