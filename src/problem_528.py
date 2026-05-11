from random import Random


class Solution:
    def __init__(self, w: List[int]):
        for i in range(1, len(w)):
            w[i] += w[i - 1]
        self.w = w
        self.r = Random()

    def pickIndex(self) -> int:
        i = self.r.randint(1, self.w[-1])
        return bisect_left(self.w, i)
