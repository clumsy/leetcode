class ExamRoom:

    def __init__(self, n: int):
        self.a = []
        self.n = n

    def seat(self) -> int:
        if not self.a:
            self.a = [0]
            return 0

        ma = self.a[0]
        mi = 0
        for i in range(1, len(self.a)):
            candidate = (self.a[i] - self.a[i - 1])//2
            if candidate > ma:
                ma = candidate
                mi = i

        if self.n - 1 - self.a[len(self.a) - 1] > ma:
            last = self.n - 1
            self.a.append(last)
            return last

        if mi == 0:
            self.a = [0] + self.a
        else:
            self.a = self.a[:mi] + [self.a[mi - 1] + ma] + self.a[mi:]
        return self.a[mi]

    def leave(self, p: int) -> None:
        for i in range(len(self.a)):
            if self.a[i] == p:
                del self.a[i]
                return
