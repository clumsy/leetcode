class Solution:
    def fairCandySwap(self, aliceSizes: List[int], bobSizes: List[int]) -> List[int]:
        diff = sum(aliceSizes) - sum(bobSizes)
        bob = set(bobSizes)
        for a in aliceSizes:
            b = a - diff // 2
            if b in bob:
                return [a, b]
