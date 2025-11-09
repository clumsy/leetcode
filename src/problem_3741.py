class Solution:
    def minimumDistance(self, nums: List[int]) -> int:
        cnt = defaultdict(list)
        for i, e in enumerate(nums):
            cnt[e].append(i)
        res = -1
        for k, v in cnt.items():
            if len(v) > 2:
                k, j = (v.pop() for _ in range(2))
                while v:
                    i = v.pop()
                    res = min(res if res != -1 else inf, k - j + j - i + k - i)
                    j, k = i, j
        return res
