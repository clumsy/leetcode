class Solution:
    def distributeCandies(self, candies: int, num_people: int) -> List[int]:
        # (1 + n) * n / 2 = c
        # n^2 + n - 2c = 0
        # D = 1 + 8c
        # n = (sqrt(1 + 8c) - 1) / 2
        n = floor((sqrt(1 + 8 * candies) - 1) / 2)
        res = [0] * num_people
        d, r = divmod(n, num_people)
        for i in range(num_people):
            times = d + (i < r)
            res[i] = min(candies, (2 * (i + 1) + (times - 1) * num_people) * times // 2)
            candies -= res[i]
        res[r] += candies
        return res
