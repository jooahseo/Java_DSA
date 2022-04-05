package easy;

public class FindClosestValueInBST {
    /**
     * O(log(n)) time | O(1) space
     * if tree.value - target < 0 , then go right
     * if tree.value - target > 0, then go left
     * if tree.value - target == 0 , return the value
     * while doing this process,
     * keep track of the closest value and smallest difference
     */
    public static int findClosestValueInBst(BST tree, int target) {
        //0 is current closest value, 1 is current smallest diff
        int[] currentClosestValueAndDiff = {tree.value, Math.abs(tree.value-target)};
        BST currNode = tree;
        while(currNode != null){
            int currentDiff = currNode.value - target;
            if(currentDiff == 0) return tree.value;
            if(currentDiff < 0){
                updateClosestAndDiff(currentClosestValueAndDiff, currNode.value, currentDiff);
                currNode = tree.right;
            }else{
                updateClosestAndDiff(currentClosestValueAndDiff, currNode.value, currentDiff);
                currNode = tree.left;
            }
        }
        return currentClosestValueAndDiff[0];
    }

    public static void updateClosestAndDiff(int[] currentPair, int currentValue, int currentDiff){
        if(currentPair[1] > Math.abs(currentDiff)){
            currentPair[0] = currentValue;
            currentPair[1] = currentDiff;
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
