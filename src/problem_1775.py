import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1775](https://leetcode.com/problems/equal-sum-arrays-with-minimum-number-of-operations)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution2:
        def minOperations(self, nums1: List[int], nums2: List[int]) -> int:
            s1, s2 = sum(nums1), sum(nums2)
            if s1 > s2:
                s1, s2 = s2, s1
                nums1, nums2 = nums2, nums1
            if len(nums1) * 6 < len(nums2) * 1:
                res = -1
            else:
                cnt1, cnt2 = Counter(nums1), Counter(nums2)
                res = 0
                while s2 != s1:
                    n1, n2 = min(cnt1), max(cnt2)
                    m1, m2 = 6 - n1, n2 - 1
                    if s2 - s1 <= max(m1, m2):
                        res += 1
                        break
                    res += 1
                    if m1 > m2:
                        s1 += m1
                        cnt1[6] += 1
                        cnt1[n1] -= 1
                        if cnt1[n1] == 0:
                            del cnt1[n1]
                    else:
                        s2 -= m2
                        cnt2[1] += 1
                        cnt2[n2] -= 1
                        if cnt2[n2] == 0:
                            del cnt2[n2]       
            return res
    return Solution2,


@app.cell
def __(Counter, List):
    class Solution:
        def minOperations(self, nums1: List[int], nums2: List[int]) -> int:
            s1, s2 = sum(nums1), sum(nums2)
            if s1 > s2:
                s1, s2 = s2, s1
                nums1, nums2 = nums2, nums1
            if len(nums1) * 6 < len(nums2) * 1:
                res = -1
            else:
                cnt = Counter()
                for n1 in nums1:
                    if n1 < 6:
                        cnt[6 - n1] += 1
                for n2 in nums2:
                    if n2 > 1:
                        cnt[n2 - 1] += 1
                res, diff = 0, s2 - s1
                for i in reversed(range(1, 6)):
                    take = min(cnt.get(i, 0), (diff + i - 1) // i)
                    res += take
                    diff -= take * i
                    if diff <= 0:
                        break
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minOperations([1,2,3,4,5,6], [1,1,2,2,2,2]) == 3
    return


@app.cell
def __(sol):
    assert sol.minOperations([1,1,1,1,1,1,1], [6]) == -1
    return


@app.cell
def __(sol):
    assert sol.minOperations([6,6], [1]) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
