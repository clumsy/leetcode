class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        res, lo, hi = (0, 0, len(people) - 1)
        while lo <= hi:
            if people[lo] + (people[hi] if hi != lo else 0) <= limit:
                lo = lo + 1
            hi = hi - 1
            res = res + 1
        return res

# class Solution:
#     def numRescueBoats(self, people: List[int], limit: int) -> int:
#         people.sort(reverse=True)
#         boats = []
#         for p in people:
#             if boats and boats[0][0] < 2 and (-boats[0][1] >= p):
#                 boat = heappop(boats)
#                 boat[0] = boat[0] + 1
#                 boat[1] = boat[1] + p
#             else:
#                 boat = [1, -limit + p]
#             heappush(boats, boat)
#         res = len(boats)
#         return res
