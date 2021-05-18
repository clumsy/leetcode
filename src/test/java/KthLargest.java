import java.util.concurrent.atomic.AtomicInteger;

public class KthLargest {
    
    private static class Node {
        int val;
        Node left;
        Node right;
    }
    
    static int findKthLargest(int k, Node root) {
        return doFindLargest(new AtomicInteger(k), root);
    }

    static private Integer doFindLargest(AtomicInteger k, Node root) {
        if (root == null) {
            return null;
        }
        Integer right = doFindLargest(k, root.right);
        if (right != null) {
            return right;
        }
        if (k.decrementAndGet() == 0) {
            return root.val;
        }
        return doFindLargest(k, root.left);
    }
    
    public static void main(String[] args) {
        Node root = new Node();
        root.val = 6;
        root.left = new Node();
        root.left.val = 3;
        root.left.left = new Node();
        root.left.left.val = 1;
        root.left.right = new Node();
        root.left.right.val = 5;
        root.right = new Node();
        root.right.val = 7;
        root.right.right = new Node();
        root.right.right.val = 9;
        root.right.right.left = new Node();
        root.right.right.left.val = 8;
        System.out.println(findKthLargest(3, root));
    }
}
