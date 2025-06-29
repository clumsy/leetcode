class Solution:
    def averageOfSubtree(self, root: Optional[TreeNode]) -> int:
        _, _, count = self._averageOfSubtree(root)
        return count

    def _averageOfSubtree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0, 0, 0
        le, cnt_le, res_le = self._averageOfSubtree(root.left)
        ri, cnt_ri, res_ri = self._averageOfSubtree(root.right)
        ttl, cnt, res = root.val + le + ri, cnt_le + cnt_ri + 1, res_le + res_ri
        if cnt > 0 and root.val == ttl//cnt:
            res += 1
        return ttl, cnt, res
