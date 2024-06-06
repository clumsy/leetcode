import marimo

__generated_with = "0.6.15"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 341](https://leetcode.com/problems/flatten-nested-list-iterator)")
    return


@app.cell
def __():
    class NestedInteger:
        def __init__(self, v):
            self.val = (type(v), v)

        def isInteger(self) -> bool:
            return self.val[0] == int

        def getInteger(self) -> int:
            return self.val[1]

        def getList(self):
            return self.val[1]
    return NestedInteger,


@app.cell
def __(NestedInteger):
    class NestedIterator:
        def __init__(self, nestedList: [NestedInteger]):
            self.stack = nestedList[::-1]

        def next(self) -> int:
            return self.stack.pop().getInteger()

        def hasNext(self) -> bool:
            while self.stack and not self.stack[-1].isInteger():
                self.stack.extend(self.stack.pop().getList()[::-1])
            return self.stack
    return NestedIterator,


@app.cell
def __(NestedInteger, NestedIterator):
    nestedList1 = [
        NestedInteger([
            NestedInteger(1),
            NestedInteger(1),
        ]),
        NestedInteger(2),
        NestedInteger([
            NestedInteger(1),
            NestedInteger(1),
        ])
    ]
    i1, v1 = NestedIterator(nestedList1), []
    while i1.hasNext(): v1.append(i1.next())
    assert v1 == [1,1,2,1,1]
    return i1, nestedList1, v1


@app.cell
def __(NestedInteger, NestedIterator):
    nestedList2 = [NestedInteger([NestedInteger(1),NestedInteger([NestedInteger(4), NestedInteger(6)])])]
    i2, v2 = NestedIterator(nestedList2), []
    while i2.hasNext(): v2.append(i2.next())
    assert v2 == [1,4,6]
    return i2, nestedList2, v2


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
