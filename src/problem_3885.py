# class EventManager:
#     def __init__(self, es: list[list[int]]):
#         self.q = [None, *[[p, -e] for e, p in es]]
#         self.l = len(es)
#         self.m = {-es[i][0]: i + 1 for i in range(self.l)}
#         for i in range(2, self.l + 1):
#             self._swim(i)
#
#     def updatePriority(self, ei: int, np: int) -> None:
#         i = self.m[-ei]
#         self.q[i][0], op = np, self.q[i][0]
#         if op < np:
#             self._swim(i)
#         else:
#             self._sink(i)
#
#     def pollHighest(self) -> int:
#         if not self.l:
#             return -1
#         res = self.q[1][1]
#         self.q[1] = self.q[self.l]
#         self.m[self.q[1][1]] = 1
#         self.l -= 1
#         self._sink(1)
#         return -res
#
#     def _swim(self, i):
#         while i > 1:
#             i_ = i // 2
#             if self.q[i] > self.q[i_]:
#                 self.m[self.q[i][1]], self.m[self.q[i_][1]] = self.m[self.q[i_][1]], self.m[self.q[i][1]]
#                 self.q[i], self.q[i_] = self.q[i_], self.q[i]
#                 i = i_
#                 continue
#             break
#
#     def _sink(self, i):
#         while i * 2 <= self.l:
#             i_ = i * 2
#             if i_ + 1 <= self.l and self.q[i_ + 1] > self.q[i_]:
#                 i_ += 1
#             if i_ <= self.l and self.q[i] < self.q[i_]:
#                 self.m[self.q[i][1]], self.m[self.q[i_][1]] = self.m[self.q[i_][1]], self.m[self.q[i][1]]
#                 self.q[i], self.q[i_] = self.q[i_], self.q[i]
#                 i = i_
#                 continue
#             break


class EventManager:
    def __init__(self, es: list[list[int]]):
        self.q = [(-p, i) for i, p in es]
        self.p = defaultdict(lambda: 0, es)
        heapify(self.q)

    def updatePriority(self, i: int, p: int) -> None:
        self.p[i] = p
        heappush(self.q, (-p, i))

    def pollHighest(self) -> int:
        while self.q:
            p, i = heappop(self.q)
            if self.p[i] == -p:
                del self.p[i]
                return i
        return -1
