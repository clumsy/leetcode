import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2452](https://leetcode.com/problems/words-within-two-edits-of-dictionary)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution2:
        def twoEditWords(self, queries: List[str], dictionary: List[str]) -> List[str]:
            res, n = [], len(queries[0])
            for q in queries:
                if any(n - sum(c1 == c2 for c1, c2 in zip(q, d)) <= 2 for d in dictionary):
                    res.append(q)
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def twoEditWords(self, queries: List[str], dictionary: List[str]) -> List[str]:
            def c2i(c):
                return ord(c) - ord("a")

            class TrieNode:
                def __init__(self):
                    self.chars = [None] * 26
                    self.term = False

            def insert(node, d):
                if d:
                    i = c2i(d[0])
                    new = node.chars[i]
                    if new is None:
                        new = TrieNode()
                    new.term |= len(d) == 1
                    node.chars[i] = new
                    insert(new, d[1:])

            def find(node, w, edits):
                if node is None or edits < 0:
                    return False
                if not w:
                    return node.term
                for i in range(len(node.chars)):
                    if find(node.chars[i], w[1:], edits - (c2i(w[0]) != i)):
                        return True
                return False

            root = TrieNode()
            for d in dictionary:
                insert(root, d)
            res = []
            for q in queries:
                if find(root, q, 2):
                    res.append(q)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.twoEditWords(["word","note","ants","wood"], ["wood","joke","moat"]) == ["word","note","wood"]
    return


@app.cell
def __(sol):
    assert sol.twoEditWords(["yes"], ["not"]) == []
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
