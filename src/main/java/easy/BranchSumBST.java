package easy;

import java.util.ArrayList;
import java.util.List;

public class BranchSumBST {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * O(n) time, O(n) space where n is the node count in BST
     */
    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        ArrayList<Integer> sum = new ArrayList<>();
        return addSum(root, 0, sum);
    }
    public static List<Integer> addSum(BinaryTree currentNode, int currentSum, ArrayList<Integer> sum){
        currentSum = currentSum + currentNode.value;
        if(currentNode.left != null){
            addSum(currentNode.left, currentSum, sum);
        }
        if(currentNode.right != null){
            addSum(currentNode.right, currentSum, sum);
        }
        if(currentNode.left == null && currentNode.right == null) sum.add(currentSum);

        return sum;
    }
}
