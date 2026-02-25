# time:  O(N^2)
# space: O(1)
# class Solution2:
#     def reconstructQueue(self, people: List[List[int]]) -> List[List[int]]:
#         people = sorted(people, key=lambda p: (-p[0], p[1]))
#         res = []
#         for p in people:
#             res.insert(p[1], p)
#         return res

# time:  O(N*log(N))
# space: O(N)
class Solution:
    def reconstructQueue(self, people: List[List[int]]) -> List[List[int]]:
        n = len(people)
        bit = [0] * (n + 1)  # bit[0] is not used

        def _update(i, delta):
            i += 1
            while i <= n:
                bit[i] += delta
                i += i & -i

        def _query(i):
            i += 1
            s = 0
            while i > 0:
                s += bit[i]
                i -= i & -i
            return s

        for i in range(1, n):  # no empty slots left of 0th
            _update(i, 1)  # remember empty slots count on the left

        people = sorted(people, key=lambda p: (p[0], -p[1]))  # sort by h_i ascending, then k_i descending

        res = [None] * n
        for p in people:
            l, r = 0, n
            while l < r:
                mid = l + (r - l) // 2
                if _query(mid) < p[1]:
                    l = mid + 1
                else:
                    r = mid
            res[l] = p
            _update(l, -1)  # remove empty slot

        return res
