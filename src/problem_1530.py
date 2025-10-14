class Solution:
    def countPairs(self, root: TreeNode, distance: int) -> int:
        def count_len(node, depth):
            if node is None:
                return Counter(), 0

            if node.left is None and node.right is None:
                return Counter([1]), 0

            cnt_left, res_left = count_len(node.left, depth + 1)
            cnt_right, res_right = count_len(node.right, depth + 1)
            res = res_left + res_right

            for len_left in cnt_left:
                for len_right in cnt_right:
                    if len_left + len_right <= distance:
                        res += cnt_left[len_left] * cnt_right[len_right]

            cnt = Counter()
            for len_left in cnt_left:
                cnt[len_left + 1] += cnt_left[len_left]
            for len_right in cnt_right:
                cnt[len_right + 1] += cnt_right[len_right]

            return cnt, res

        _, res = count_len(root, 0)
        return res
