package easy;

public class RemoveDuplicateLinkedList {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    /**
     * O(n) Time, O(1) space
     * @param linkedList
     * @return
     */
    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList currentNode = linkedList;
        while(currentNode != null){
            LinkedList nextNode = currentNode.next;
            while(nextNode!=null && currentNode.value == nextNode.value){
                nextNode = nextNode.next;
            }
            currentNode.next = nextNode;
            currentNode = currentNode.next;
        }
        return linkedList;
    }
}
