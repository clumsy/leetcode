class MyHashSet:
    def __init__(self):
        self.keys = []

    def add(self, key: int) -> None:
        i = self._index(key)
        if i == len(self.keys):
            self.keys.append(key)
        elif self.keys[i] != key:
            self.keys = self.keys[:i] + [key] + self.keys[i:]

    def remove(self, key: int) -> None:
        i = self._index(key)
        if i < len(self.keys) and self.keys[i] == key:
            self.keys = self.keys[:i] + self.keys[i + 1:]

    def _index(self, key: int) -> int:
        return bisect_left(self.keys, key)

    def contains(self, key: int) -> bool:
        i = self._index(key)
        return i < len(self.keys) and self.keys[i] == key
