class RLEIterator:
    def __init__(self, encoding: List[int]):
        self.encoding = encoding
        self.pos = 0

    def next(self, n: int) -> int:
        while self.pos < len(self.encoding):
            if self.encoding[self.pos] > 0:
                cnt = min(n, self.encoding[self.pos])
                n -= cnt
                self.encoding[self.pos] -= cnt
                if n == 0:
                    return self.encoding[self.pos + 1]
            self.pos += 2
        return -1
