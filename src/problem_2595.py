class Solution:
    def evenOddBit(self, n: int) -> List[int]:
        even, odd = (n & 0b010101010101).bit_count(), (n & 0b101010101010).bit_count()
        res = [even, odd]
        return res
