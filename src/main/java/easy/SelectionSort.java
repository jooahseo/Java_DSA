package easy;

/**
 * Select the smallest number out of the array
 * and start from 0 to array.length-1 insert the smallest element
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {8,5,2,9,5,6,3};
        selectionSort(array);
        for(int n: array){
            System.out.print(n + " ");
        }
    }

    /**
     * O(n^2) Time, O(1) space
     */
    public static int[] selectionSort(int[] array) {
        // Write your code here.
        for(int i=0, n=array.length-1; i < n; i++){
            int smallestIdx = i;
            for(int j=i; j<array.length; j++){
                if(array[smallestIdx] > array[j]){
                    smallestIdx = j;
                }
            }
            if(smallestIdx != i){
                int temp = array[i];
                array[i] = array[smallestIdx];
                array[smallestIdx] = temp;
            }
        }
        return array;
    }
}
