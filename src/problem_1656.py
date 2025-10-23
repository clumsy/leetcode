class OrderedStream:
    def __init__(self, n: int):
        self.stream = [None] * n
        self.pos = 0

    def insert(self, i: int, v: str) -> List[str]:
        i -= 1
        self.stream[i] = v
        start = self.pos
        while self.pos < len(self.stream) and self.stream[self.pos]:
            self.pos += 1
        return self.stream[start : self.pos]
