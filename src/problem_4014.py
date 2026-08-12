class Solution:
    def minPrice(self, ps: list[int], ds: list[int]) -> float:
        res = sum(
            p * (100 - d) / 100
            for p, d in zip_longest(
                sorted(ps, reverse=True), sorted(ds, reverse=True), fillvalue=0
            )
        )
        return res
