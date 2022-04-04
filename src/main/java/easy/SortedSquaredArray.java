package easy;

import java.util.Arrays;

/**
 * Question: Write a function that takes in a non-empty array of integers that are sorted in ascending order
 * and returns a new array of the same length with the squares of the original integers also sorted in ascending order
 * Array can have negative values.
 */
public class SortedSquaredArray {

    /**
     * O(nlogn) Time | O(1) space
     * iterate the array
     * square the current value and assign to the array[i]
     * sort the array (in case of negative values in original)
     * return the array
     */
    public int[] sortedSquaredArray(int[] array){
        for(int i=0; i<array.length; i++){
            array[i] = (int) Math.pow(array[i], 2);
        }
        Arrays.sort(array);
        return array;
    }

    /**
     * O(n) time | O(n) Space
     * Define new array (same size of the original)
     * Use pointer of left, right
     * compare the absolute values of two
     * whichever bigger go to the end of the new array
     */
    public int[] sortedSquaredArray2(int[] array){
        int[] newArray = new int[array.length];
        int left = 0;
        int right = array.length - 1;
        int index = array.length - 1;
        while(left<=right && index >= 0){
            if(Math.abs(array[left]) < Math.abs(array[right])){
                newArray[index] = (int) Math.pow(array[right], 2);
                right --;
            }else{
                newArray[index] = (int) Math.pow(array[left],2);
                left ++;
            }
            index--;
        }
        return newArray;
    }
}
