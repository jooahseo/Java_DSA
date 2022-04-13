package easy;

/**
 * Write a function that takes in a sorted array of integers and target integer.
 * The function use the Binary Searh algorithm to determine if the target integer is contained in the array
 * and should return its index if it is, otherwise return -1.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {0,1,21,33,45,45,61,71,72,73};
        int target = 33;
        System.out.println(binarySearch(array, target));
    }

    /***
     * O(log(n))Time, O(1) Space
     */
    public static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length -1;
        while(start <= end){
            int middle = (start + end) / 2;
            if(array[middle] == target){
                return middle;
            }else if(array[middle] > target){
                end = middle - 1;
            }else{
                start = middle + 1;
            }
        }
        return -1;
    }
}
