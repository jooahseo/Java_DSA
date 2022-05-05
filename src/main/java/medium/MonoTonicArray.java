package medium;

/**
 * Write a function that takes in an array of integers and returns a boolean representing whether the array is monotonic.
 * An array is said to be monotonic if its elements, from left to right, are entirely non-increasing or entirely non-decreasing
 * Non-increasing elements aren't necessarily exclusively decreasing; they simply don't increase.
 * Similarly, non-decreasing elements aren't necessarily exclusively increasing; they simply don't decrease.
 * Note that empty arrays and arrays of one element are monotonic.
 */
public class MonoTonicArray {
    public static void main(String[] args) {
        int[] array = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        System.out.println(isMonotonic2(array)); //expect to print "true"
        System.out.println(isMonotonic2(new int[] {})); //expect to print "true"
        System.out.println(isMonotonic2(new int[] {1})); //expect to print "true"
        System.out.println(isMonotonic2(new int[] {1, 2})); //expect to print "true"
    }

    public static boolean isMonotonic(int[] array) {
        int i=0;
        while(i < array.length-1){
            if(array[i] > array[i+1]){ //decreasing
                return isMonotonicHelper(array, i+1, false);
            }else if(array[i] < array[i+1]){ //increasing
                return isMonotonicHelper(array, i+1, true);
            }
            i++;
        }
        return true;
    }

    /**
     * O(n) Time, O(1) Space
     */
    public static boolean isMonotonicHelper(int[] array, int fromIndex, boolean isIncreasing){
        int i= fromIndex;
        if(isIncreasing){
            while(i < array.length-1){
                if(array[i] > array[i+1]) return false;
                i++;
            }
        }else{
            while(i < array.length -1){
                if(array[i] < array[i+1]) return false;
                i++;
            }
        }
        return true;
    }

    /**
     * Simplified version - O(n) Time, O(1) Space where n is the element count
     */
    public static boolean isMonotonic2(int[] array) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for(int i=0; i<array.length-1; i++){
            if(array[i] > array[i+1]){
                isIncreasing = false;
            }else if(array[i] < array[i+1]){
                isDecreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }
}
