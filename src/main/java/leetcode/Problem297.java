package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

@Difficulty(Level.HARD)
@BeatsPercent(92.62)
public class Problem297 {
    public class Codec {

        // Encodes a tree to a single string.
        @TimeComplexity(worst = Complexity.LINEAR_N)
        @SpaceComplexity(worst = Complexity.LINEAR_N)
        public String serialize(TreeNode root) {
            return serialize(root, new StringBuilder()).toString();
        }

        private StringBuilder serialize(TreeNode root, StringBuilder sb) {
            if (root == null) {
                sb.append("null,");
                return sb;
            }
            sb.append(root.val).append(',');
            serialize(root.left, sb);
            serialize(root.right, sb);
            return sb;
        }

        // Decodes your encoded data to tree.
        @TimeComplexity(worst = Complexity.LINEAR_N)
        @SpaceComplexity(worst = Complexity.LINEAR_N)
        public TreeNode deserialize(String data) {
            return deserialize(new LinkedList<>(Arrays.asList(data.split(","))));
        }

        private TreeNode deserialize(Queue<String> nodes) {
            TreeNode root = treeNodeFrom(nodes);
            if (root == null) {
                return null;
            }
            root.left = deserialize(nodes);
            root.right = deserialize(nodes);
            return root;
        }

        private TreeNode treeNodeFrom(Queue<String> vals) {
            if (vals.isEmpty()) {
                return null;
            }
            String val = vals.remove();
            return "null".equals(val) ? null : new TreeNode(Integer.parseInt(val));
        }
    }
}
