class Solution:
    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        inorder, res = [], inf
        cur, lst = root, None
        while True:
            if cur is not None:
                inorder.append(cur)
                cur = cur.left
            else:
                if not inorder:
                    break
                cur = inorder.pop()
                if lst is None:
                    lst = cur
                else:
                    res = min(res, cur.val - lst.val)
                    lst = cur
                cur = cur.right
        return res
