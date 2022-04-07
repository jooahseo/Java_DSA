package easy;

public class NodeDepth {
    /**
     * O(n) time, O(k) space -> n is node count, k is tree height
     */
    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        int currentDepth = -1;
        return getDepth(root, currentDepth);
    }

    /**
     * recursive way
     */
    public static int getDepth(BinaryTree root, int currentDepth){
        if(root == null) return 0;
        currentDepth ++;
        return currentDepth + getDepth(root.left, currentDepth) + getDepth(root.right, currentDepth);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
