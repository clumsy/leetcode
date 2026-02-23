class Solution:
    def readBinaryWatch(self, turnedOn: int) -> List[str]:
        ms = defaultdict(list)
        for m in range(60):
            ms[bin(m).count("1")].append(m)
        res = []
        for h in range(12):
            c = bin(h).count("1")
            for m in ms[turnedOn - c]:
                res.append(f"{h}:{m:02d}")
        return res
