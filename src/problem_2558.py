from typing import List
from heapq import heapify, heappush, heappop
from math import floor, sqrt


class Solution:
    def pickGifts(self, gifts: List[int], k: int) -> int:
        for i in range(len(gifts)):
            gifts[i] *= -1
        heapify(gifts)
        while k > 0:
            cur = -heappop(gifts)
            heappush(gifts, -floor(sqrt(cur)))
            k -= 1
        res = -sum(gifts)
        return res
