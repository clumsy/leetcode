# class Solution:
#     def carPooling(self, trips: List[List[int]], capacity: int) -> bool:
#         trips = sorted([t for trip in trips for t in [(trip[1], trip[0]), (trip[2], -trip[0])]])
#         res = True
#         for t in trips:
#             capacity = capacity - t[1]
#             if capacity < 0:
#                 res = False
#                 break
#         return res


class Solution:
    def carPooling(self, trips: List[List[int]], capacity: int) -> bool:
        res, stops = (True, {})
        for t in trips:
            stops[t[1]] = stops.get(t[1], 0) + t[0]
            stops[t[2]] = stops.get(t[2], 0) - t[0]
        for i in range(1001):
            capacity = capacity - stops.get(i, 0)
            if capacity < 0:
                res = False
                break
        return res
