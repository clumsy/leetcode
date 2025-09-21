class Solution:
    def memLeak(self, m1: int, m2: int) -> List[int]:
        # (1 + n)*n/2 = S
        # n^2 + n - 2S = 0
        # D = 1 + 8S
        # n = (sqrt(1 + 8S) - 1)/2
        n = int((sqrt(8*(m1+m2 + 1) - 1)/2))
        for i in range(1, n + 2):
            if i > max(m1, m2):
                break
            if m1 >= m2:
                m1 -= i
            else:
                m2 -= i
        # we can optimize this as follows:
        # find at which steps m1 == m2
        # solve another quadratic equation to figure out
        # how many steps we will be alternating between the two
        # one gets odd numbers, the other one even
        # find the end values, in case of equality first is smaller
        return [i, m1, m2]
