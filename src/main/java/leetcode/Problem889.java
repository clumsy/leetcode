package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem889 {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return construct(pre, 0, pre.length - 1, post, post.length - 1);
    }

    private TreeNode construct(int[] pre, int pre_start, int pre_end, int[] post, int post_end) {
        int val = pre[pre_start];
        TreeNode root = new TreeNode(val);
        if (pre_start == pre_end) {
            return root;
        }
        int child1 = pre[pre_start + 1];
        int child2 = post[post_end - 1];
        if (child1 == child2) { // there's only one child, let it be left
            root.left = construct(pre, pre_start + 1, pre_end, post, post_end - 1);
        } else { // there are both left and right children
            int left_end = pre_start + 1;
            while (left_end <= pre_end && pre[left_end + 1] != child2) {
                left_end++;
            }
            int right_end = post_end - 1;
            while (right_end >= 0 && post[right_end] != child1) {
                right_end--;
            }
            root.left = construct(pre, pre_start + 1, left_end, post, right_end);
            root.right = construct(pre, left_end + 1, pre_end, post, post_end - 1);
        }
        return root;
    }
}
