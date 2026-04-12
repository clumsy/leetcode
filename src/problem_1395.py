class Solution:
    def numTeams(self, rating: List[int]) -> int:
        left, right = [rating[0]], sorted(rating[1:])
        n, res = len(rating), 0
        for i in range(1, n - 1):
            r = rating[i]

            # remove r from right
            hi = bisect_left(right, r)
            right = right[:hi] + right[hi + 1 :]

            # count i < j < k
            lo = bisect_right(left, r)
            hi = bisect_left(right, r)
            res += lo * (n - i - 1 - hi)

            # count i > j > k
            lo = bisect_left(left, r)
            hi = bisect_right(right, r)
            res += (i - lo) * hi

            # add r to left
            insort(left, r)
        return res
