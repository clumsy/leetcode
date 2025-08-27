class MyCalendar:
    def __init__(self):
        self.starts = []
        self.ends = {}

    def book(self, start: int, end: int) -> bool:
        i = bisect_right(self.starts, end - 1)
        if 0 < i <= len(self.starts) and start < self.ends[self.starts[i - 1]]:
            return False
        insort(self.starts, start)
        self.ends[start] = end
        return True
