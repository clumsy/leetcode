class SnapshotArray:
    def __init__(self, length: int):
        self.storage = [[(0, 0)] for _ in range(length)]
        self.snap_id = 0

    def set(self, index: int, val: int) -> None:
        self.storage[index].append((self.snap_id, val))

    def snap(self) -> int:
        self.snap_id += 1
        return self.snap_id - 1

    def get(self, index: int, snap_id: int) -> int:
        hi = bisect_right(self.storage[index], (snap_id + 1,))
        return self.storage[index][hi - 1][1]
