import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3092](https://leetcode.com/problems/most-frequent-ids)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution2:
        def mostFrequentIDs(self, nums: List[int], freq: List[int]) -> List[int]:
            p, h, res = {}, [], [0] * len(nums)
            def swim(h, i):
                while i > 0:
                    pt = i // 2
                    if h[i][0] > h[pt][0]:
                        p[h[i][1]], p[h[pt][1]] = p[h[pt][1]], p[h[i][1]]
                        h[i], h[pt] = h[pt], h[i]
                    else:
                        break
                    i = pt
                return i
            def sink(h, i):
                while i < len(h):
                    c = 2 * i
                    if c >= len(h):
                        break
                    if c + 1 < len(h) and h[c][0] < h[c + 1][0]:
                        c += 1
                    if h[i][0] < h[c][0]:
                        p[h[i][1]], p[h[c][1]] = p[h[c][1]], p[h[i][1]]
                        h[i], h[c] = h[c], h[i]
                        i = c
                    else:
                        break
                return i
            for i, id in enumerate(nums):
                if id not in p:
                    p[id] = len(h)
                    h.append([freq[i], id])
                    p[id] = swim(h, len(h) - 1)
                else:
                    h[p[id]][0] += freq[i]
                    p[id] = swim(h, p[id]) if freq[i] > 0 else sink(h, p[id])
                res[i] = max(0, h[0][0])
            return res
    return Solution2,


@app.cell
def __():
    from collections import Counter
    from heapq import heappop, heappush
    return Counter, heappop, heappush


@app.cell
def __(Counter, List, heappop, heappush):
    class Solution:
        def mostFrequentIDs(self, nums: List[int], freq: List[int]) -> List[int]:
            cnt, h, res = Counter(), [], [0] * len(nums)
            for i, id in enumerate(nums):
                cnt[id] += freq[i]
                heappush(h, [-cnt[id], id])
                while cnt[h[0][1]] != -h[0][0]:
                    heappop(h)
                res[i] = max(0, -h[0][0])
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.mostFrequentIDs([2,3,2,1], [3,2,-3,1]) == [3,3,2,2]
    return


@app.cell
def __(sol):
    assert sol.mostFrequentIDs([5,5,3], [2,-2,1]) == [2,0,1]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
