package medium;

import java.util.HashSet;

/**
 * Given an array of integers between 1 and n, inclusive, where n is the length of the array,
 * write a function that returns the first integer that appears more than once (when the array is read from left to right)
 * In other words, out of all the integers that might occur more than once in the input array,
 * your function should return the once whose first duplicate value has the minimum index
 * If no integer appears more than once, your function should return -1
 * Note that you're allowed to mutate the input array.
 */
public class FirstDuplicateValue {
    public static void main(String[] args) {
        int[] array1 = {2,1,5,2,3,3,4};
        int[] array2 = {2,1,5,3,3,2,4};

        System.out.println(firstDuplicateValue(array1)); // expect 2
        System.out.println(firstDuplicateValue(array2)); // expect 3
    }

    /**
     * O(n) Time, O(n) Space
     * @param array
     * @return
     */
    public static int firstDuplicateValue(int[] array){
        HashSet<Integer> existNum = new HashSet<>();
        for (int currentNum : array) {
            if (existNum.contains(currentNum)) {
                return currentNum;
            } else {
                existNum.add(currentNum);
            }
        }
        return -1;
    }
}
