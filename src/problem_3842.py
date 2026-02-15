class Solution:
    def toggleLightBulbs(self, bulbs: list[int]) -> list[int]:
        on = [0] * 100
        for b in bulbs:
            on[b - 1] ^= 1
        res = [i + 1 for i, v in enumerate(on) if v]
        return res
