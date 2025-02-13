class FrequencyTracker:
    def __init__(self):
        self.cnt = Counter()
        self.frq = Counter()

    def add(self, number: int) -> None:
        self.frq[self.cnt[number]] -= 1
        self.cnt[number] += 1
        self.frq[self.cnt[number]] += 1

    def deleteOne(self, number: int) -> None:
        if self.cnt[number] > 0:
            self.frq[self.cnt[number]] -= 1
            self.cnt[number] -= 1
            self.frq[self.cnt[number]] += 1

    def hasFrequency(self, f: int) -> bool:
        return self.frq[f] > 0
