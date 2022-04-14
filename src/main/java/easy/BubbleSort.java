package easy;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {8,5,2,9,5,6,3};
        bubbleSort(array);
        for(int n: array){
            System.out.print(n + " ");
        }
    }

    /**
     * Best O(n) Time, O(1) Space
     * Worst O(n^2) Time, O(1) Space
     */
    public static int[] bubbleSort(int[] array){
        boolean swapped = false;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j] > array[j+1]){
                    swapped = true;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if(!swapped) break;
            swapped = false;
        }
        return array;
    }
}
