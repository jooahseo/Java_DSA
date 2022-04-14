package easy;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {8,5,2,9,5,6,3};
        insertionSort(array);
        for(int n: array){
            System.out.print(n + " ");
        }
    }

    /**
     * Best: O(n) Time, O(1) Space
     * Worst: O(n^2) Time, O(1) Space
     * @param array
     */
    public static void insertionSort(int[] array){
        boolean swapped = false;
        for(int sorted=0; sorted<array.length-1; sorted++){
            for(int unSorted=sorted+1; unSorted > 0; unSorted--){
                if(array[unSorted-1] > array[unSorted]){
                    swapped = true;
                    int temp = array[unSorted-1];
                    array[unSorted-1] = array[unSorted];
                    array[unSorted] = temp;
                }
                if(!swapped) break;
            }
            swapped = false;
        }
    }
}
