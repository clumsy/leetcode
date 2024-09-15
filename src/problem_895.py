import marimo

__generated_with = "0.8.21"
app = marimo.App(width="medium")


@app.cell
def __():
    from collections import Counter
    from heapq import heappush, heappop
    return Counter, heappop, heappush


@app.cell
def __(Counter, heappop, heappush):
    class FreqStack2:
        def __init__(self):
            self.cnt = Counter()
            self.stk = []
            self.time = 0

        def push(self, val: int) -> None:
            self.cnt[val] += 1
            heappush(self.stk, (-self.cnt[val], -self.time, val))
            self.time += 1

        def pop(self) -> int:
            _, _, val = heappop(self.stk)
            self.cnt[val] -= 1
            return val
    return (FreqStack2,)


@app.cell
def __():
    from collections import defaultdict
    return (defaultdict,)


@app.cell
def __(Counter, defaultdict):
    class FreqStack:
        def __init__(self):
            self.freq = Counter()
            self.maxs = defaultdict(list)
            self.maxf = 0

        def push(self, val: int) -> None:
            self.freq[val] += 1
            self.maxf = max(self.maxf, self.freq[val])
            self.maxs[self.freq[val]].append(val)

        def pop(self) -> int:
            val = self.maxs[self.maxf].pop()
            self.freq[val] -= 1
            if not self.maxs[self.maxf]:
                self.maxf -= 1
            return val
    return (FreqStack,)


@app.cell
def __(FreqStack):
    sol = FreqStack()
    sol.push(5)
    sol.push(7)
    sol.push(5)
    sol.push(7)
    sol.push(4)
    sol.push(5)
    assert 5 == sol.pop()
    assert 7 == sol.pop()
    assert 5 == sol.pop()
    assert 4 == sol.pop()
    return (sol,)


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
