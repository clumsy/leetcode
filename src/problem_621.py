import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 621](https://leetcode.com/problems/task-scheduler)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    from heapq import heapify, heappush, heappop
    return Counter, List, heapify, heappop, heappush


@app.cell
def __(Counter, List, heapify, heappop, heappush):
    class Solution2:
        def leastInterval(self, tasks: List[str], n: int) -> int:
            cnt = Counter(tasks)
            h = [-v for v in cnt.values()]
            heapify(h)
            res = 0
            while h:
                nxt = []
                for i in range(n + 1):
                    cur = -heappop(h)
                    if cur > 1:
                        nxt.append(cur - 1)
                    if not h:
                        break
                res += n + 1 if h or nxt else i + 1
                for i in nxt:
                    heappush(h, -i)
            return res
    return Solution2,


@app.cell
def __(Counter, List):
    class Solution:
        def leastInterval(self, tasks: List[str], n: int) -> int:
            cnt = list(Counter(tasks).values())
            max_frq = max(cnt)
            max_frq_cnt = cnt.count(max_frq)
            res = max(len(tasks), (max_frq - 1) * (n + 1) + max_frq_cnt)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.leastInterval(["A","A","A","B","B","B"], 2) == 8
    return


@app.cell
def __(sol):
    assert sol.leastInterval(["A","C","A","B","D","B"], 1) == 6
    return


@app.cell
def __(sol):
    assert sol.leastInterval(["A","A","A", "B","B","B"], 3) == 10
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
