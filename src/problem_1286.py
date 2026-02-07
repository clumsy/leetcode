class CombinationIterator:
    def __init__(self, characters: str, combinationLength: int):
        self.q = deque()
        self.q.appendleft(([], characters))
        self.length = combinationLength

    def next(self) -> str:
        while True:
            e = self.q.pop()
            if len(e[0]) == self.length:
                return "".join(e[0])
            for i, c in enumerate(e[1]):
                self.q.appendleft((e[0] + [c], e[1][i + 1 :]))

    def hasNext(self) -> bool:
        return len(self.q) > 0
