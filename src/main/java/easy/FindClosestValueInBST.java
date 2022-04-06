package easy;

public class FindClosestValueInBST {
    /**
     * O(log(n)) time, O(1) space || Worst: O(n) Time, O(n) space
     * if tree.value < target, then go right
     * if tree.value > target, then go left
     * if tree.value - target == 0 , return the value
     * while doing this process,
     * keep track of the closest value
     */
    public static int findClosestValueInBst(BST tree, int target) {
        int closestValue = tree.value;
        while(tree != null){
            if(tree.value - target == 0) return tree.value;
            if(Math.abs(closestValue - target) > Math.abs(tree.value -target)){
                closestValue = tree.value;
            }
            if(tree.value < target){
                tree = tree.right;
            }else{
                tree = tree.left;
            }
        }
        return closestValue;
    }

    /**
     * O(log(n)) Time, O(log(n)) Space || Worst: O(n) Time, O(n) space
     * call the method itself - recursive way
     */
    public static int findClosestValueInBstRecursive(BST tree, int target) {
        int closestValue = tree.value;
        return getClosestValueFromBST(tree, target, closestValue);
    }

    public static int getClosestValueFromBST(BST currentNode, int target, int closestValue){
        if(currentNode == null)  return closestValue;
        if(currentNode.value - target == 0 ) return currentNode.value;
        if(Math.abs(closestValue - target) > Math.abs(currentNode.value - target)){
            closestValue = currentNode.value;
        }
        if(currentNode.value < target){
            return getClosestValueFromBST(currentNode.right, target, closestValue);
        }else{
            return getClosestValueFromBST(currentNode.left, target, closestValue);
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
