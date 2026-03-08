class Solution:
    def makesquare(self, m: List[int]) -> bool:
        w, r = divmod(sum(m), 4)
        if r != 0 or max(m) > w:
            return False

        # DP
        @lru_cache(None)
        def dfs(mask):
            # no match sticks left
            if mask == 0:
                return 0
            for i in range(len(m)):
                if mask & 1 << i:
                    # sum without current match stick
                    other = dfs(mask ^ 1 << i)
                    if other >= 0 and other + m[i] <= w:
                        # remaining sum for current side
                        return (other + m[i]) % w
            return -1

        return dfs((1 << len(m)) - 1) == 0
