import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 641](https://leetcode.com/problems/design-circular-deque)")
    return


@app.cell
def __():
    class Node:
        def __init__(self, val, lft=None, rgt=None):
            self.val = val
            self.lft = lft
            self.rgt = rgt

    class MyCircularDeque3:

        def __init__(self, k: int):
            self.fst = self.lst = None
            self.k = k

        def insertFront(self, val: int) -> bool:
            if self.isFull():
                return False
            self.fst = Node(val, rgt=self.fst)
            if self.fst.rgt:
                self.fst.rgt.lft = self.fst
            else:
                self.lst = self.fst
            self.k -= 1
            return True

        def insertLast(self, val: int) -> bool:
            if self.isFull():
                return False
            self.lst = Node(val, lft=self.lst)
            if self.lst.lft:
                self.lst.lft.rgt = self.lst
            else:
                self.fst = self.lst
            self.k -= 1
            return True

        def deleteFront(self) -> bool:
            if self.isEmpty():
                return False
            if self.lst == self.fst:
                self.lst = self.fst = None
            else:
                self.fst = self.fst.rgt
            self.k += 1
            return True

        def deleteLast(self) -> bool:
            if self.isEmpty():
                return False
            if self.lst == self.fst:
                self.lst = self.fst = None
            else:
                self.lst = self.lst.lft
            self.k += 1
            return True

        def getFront(self) -> int:
            if self.isEmpty():
                return -1
            return self.fst.val

        def getRear(self) -> int:
            if self.isEmpty():
                return -1
            return self.lst.val

        def isEmpty(self) -> bool:
            return self.fst == self.lst == None

        def isFull(self) -> bool:
            return self.k == 0
    return MyCircularDeque3, Node


@app.cell
def __():
    class MyCircularDeque2:

        def __init__(self, k: int):
            self.frt = []
            self.end = []
            self.k = k

        def insertFront(self, value: int) -> bool:
            if self.isFull():
                return False
            self.frt.append(value)
            return True

        def insertLast(self, value: int) -> bool:
            if self.isFull():
                return False
            self.end.append(value)
            return True

        def deleteFront(self) -> bool:
            if not self.frt:
                while self.end:
                    self.frt.append(self.end.pop())
            if self.frt:
                self.frt.pop()
                return True
            return False

        def deleteLast(self) -> bool:
            if not self.end:
                while self.frt:
                    self.end.append(self.frt.pop())
            if self.end:
                self.end.pop()
                return True
            return False

        def getFront(self) -> int:
            if not self.frt:
                while self.end:
                    self.frt.append(self.end.pop())
            if self.frt:
                return self.frt[-1]
            return -1

        def getRear(self) -> int:
            if not self.end:
                while self.frt:
                    self.end.append(self.frt.pop())
            if self.end:
                return self.end[-1]
            return -1
            

        def isEmpty(self) -> bool:
            return len(self.frt) + len(self.end) == 0

        def isFull(self) -> bool:
            return len(self.frt) + len(self.end) == self.k
    return MyCircularDeque2,


@app.cell
def __():
    class MyCircularDeque:

        def __init__(self, k: int):
            self.arr = [None] * k
            self.fst = self.lst = None
            self.usd = 0

        def insertFront(self, val: int) -> bool:
            if self.isFull():
                return False
            if self.fst == self.lst == None:
                self.fst = self.lst = 0
            else:
                self.fst = (self.fst + 1) % len(self.arr)
            self.arr[self.fst] = val
            self.usd += 1
            return True

        def insertLast(self, val: int) -> bool:
            if self.isFull():
                return False
            if self.fst == self.lst == None:
                self.fst = self.lst = 0
            else:
                self.lst = (self.lst - 1) % len(self.arr)
            self.arr[self.lst] = val
            self.usd += 1
            return True

        def deleteFront(self) -> bool:
            if self.isEmpty():
                return False
            if self.fst == self.lst == 0:
                self.fst = self.lst = None
            else:
                self.fst = (self.fst - 1) % len(self.arr)
            self.usd -= 1
            return True

        def deleteLast(self) -> bool:
            if self.isEmpty():
                return False
            if self.fst == self.lst == 0:
                self.fst = self.lst = None
            else:
                self.lst = (self.lst + 1) % len(self.arr)
            self.usd -= 1
            return True

        def getFront(self) -> int:
            if self.isEmpty():
                return -1
            return self.arr[self.fst]

        def getRear(self) -> int:
            if self.isEmpty():
                return -1
            return self.arr[self.lst]

        def isEmpty(self) -> bool:
            return self.usd == 0

        def isFull(self) -> bool:
            return self.usd == len(self.arr)
    return MyCircularDeque,


@app.cell
def __(MyCircularDeque):
    sol = MyCircularDeque(3)
    assert sol.insertLast(1)
    assert sol.insertLast(2)
    assert sol.insertFront(3)
    assert not sol.insertFront(4)
    assert sol.getRear() == 2
    assert sol.isFull()
    assert sol.deleteLast()
    assert sol.insertFront(4)
    assert sol.getFront() == 4
    return sol,


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
