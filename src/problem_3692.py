class Solution:
    def majorityFrequencyGroup(self, s: str) -> str:
        cnt, frq = Counter(s), defaultdict(list)
        for c, k in cnt.items():
            frq[k].append(c)
        m = max(frq, key=lambda x: (len(frq[x]), x))
        res = "".join(frq[m])
        return res
