class Solution:
    def findFrequentTreeSum(self, root: Optional[TreeNode]) -> List[int]:
        cnt = Counter()

        def dfs(node):
            if node is None:
                return 0
            s = node.val + dfs(node.left) + dfs(node.right)
            cnt[s] += 1
            return s

        dfs(root)
        res = []
        for v, c in cnt.most_common():
            if res and c < cnt[res[-1]]:
                break
            res.append(v)
        return res
