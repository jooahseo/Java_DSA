package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Write a function that takes in an array of at least three integers and,
 * without sorting the input array, returns a sorted array of the three largest integers in the input array.
 * The function should return duplicate integers if necessary;
 * for example, it should return [10,10,12] for an input array of [10,5,9,10,12]
 */
public class FindThreeLargestNumbers {
    public static void main(String[] args){
        int[] array = {141,1,17,-7,-17,-27,18,541,8,7,7};
        int[] largestThree = findThreeLargestNumbers(array);

        for(int n: largestThree){
            System.out.println(n);
        }
    }

    /**
     * Brute force approach
     * Sort the array - and return the last 3
     * O(nlog(n)) Time, O(1) Space
     */
    public static int[] findThreeLargestNumbers(int[] array){
        Arrays.sort(array);
        return new int[] {array[array.length-3], array[array.length-2], array[array.length-1]};
    }

    /**
     * TODO: add optimal way - WIP
     */
    public static int[] findThreeLargestNumbers2(int[] array){
        int[] threeLargest = {array[0], array[1], array[2]};
        for(int i=3; i<array.length; i++){
            insertLargest(threeLargest, array[i]);
        }
        Arrays.sort(threeLargest);
        return threeLargest;
    }

    public static void insertLargest(int[] threeLargest, int number){

    }
}
