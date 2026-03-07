# class Solution:
#     def findRadius(self, houses: List[int], heaters: List[int]) -> int:
#         heaters.sort()
#
#         def heated(ho, r):
#             h = bisect_left(heaters, ho - r)
#             return h < len(heaters) and heaters[h] - r <= ho <= heaters[h] + r
#
#         lo, hi = 0, max(max(houses), heaters[-1])
#         while lo < hi:
#             mi = (lo + hi) // 2
#             if all(heated(ho, mi) for ho in houses):
#                 hi = mi
#             else:
#                 lo = mi + 1
#
#         return lo


class Solution:
    def findRadius(self, houses: List[int], heaters: List[int]) -> int:
        heaters.sort()
        res = max(
            (
                min(
                    (
                        abs(house - heater)
                        for i in [bisect_left(heaters, house)]
                        for heater in heaters[max(0, i - 1) : i + 2]
                    )
                )
                for house in houses
            )
        )
        return res
