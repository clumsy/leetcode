class KthLargest:
    def __init__(self, k: int, nums: List[int]):
        self.k = k
        self.q = []
        for n in nums:
            self.add(n)

    def add(self, val: int) -> int:
        heappush(self.q, val)
        if len(self.q) > self.k:
            heappop(self.q)
        return self.q[0]
