public class AddNexts {
    static class Node {
        int val;
        Node left;
        Node right;
        Node next;
    }
    
    static void addNexts(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            root.left.next = root.right;
            if (root.next != null) {
                root.right.next = root.next.left;
            }
        }
        addNexts(root.left);
        addNexts(root.right);
    }
    
    public static void main(String[] args) {
        Node root = new Node();
        root.val = 2;
        root.left = new Node();
        root.left.val = 3;
        root.left.left = new Node();
        root.left.left.val = 1;
        root.left.right = new Node();
        root.left.right.val = 4;
        root.right = new Node();
        root.right.val = 7;
        root.right.right = new Node();
        root.right.right.val = 9;
        addNexts(root);
        root.toString();
    }
}
