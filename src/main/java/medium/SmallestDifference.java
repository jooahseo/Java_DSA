package medium;

import java.util.Arrays;

/**
 * Write a function that takes in two non-empty arrays of integers, finds the pair of numbers(one from each array)
 * whose absolute difference is closest to zero, and returns an array containing these two numbers,
 * with the number from the first array in the first position
 *
 * The absolute difference of -5 and 5 is 10, and the absolute difference of -5 and -4 is 1.
 * There will be only 1 pair of numbers with the smallest difference.
 */
public class SmallestDifference {
    public static void main(String[] args) {
        int[] arrayOne = {-1, 5, 10, 2, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};

        for(int n : smallestDifference(arrayOne, arrayTwo)){
            System.out.println(n); //print 28, 26
        }

        for(int n : smallestDifference2(arrayOne, arrayTwo)){
            System.out.println(n); //print 28, 26
        }
    }

    /**
     * Brute force approach - O(n^2) Time, O(1) space
     */
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] smallestDiffPair = new int[2];
        int smallestDifference = Integer.MAX_VALUE;
        for(int i=0; i<arrayOne.length; i++){
            int numFromFirst = arrayOne[i];
            for(int j=0; j<arrayTwo.length; j++){
                int currDiff = Math.abs(numFromFirst - arrayTwo[j]);
                if(currDiff < smallestDifference){
                    smallestDiffPair[0] = numFromFirst;
                    smallestDiffPair[1] = arrayTwo[j];
                    smallestDifference = currDiff;
                }
            }
        }
        return smallestDiffPair;
    }

    /**
     * O(nlog(n)) Time , O(1) Space where n is the element counts in the array
     * 1. Sort each array
     * 2. Use the pointer and find the smallest difference and its pair
     */
    public static int[] smallestDifference2(int[] arrayOne, int[] arrayTwo) {
        int[] smallestDiffPair = new int[2];
        int smallestDifference = Integer.MAX_VALUE;

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int pointer1 = 0;
        int pointer2 = 0;

        while(pointer1 < arrayOne.length && pointer2 < arrayTwo.length){
            int firstNum = arrayOne[pointer1];
            int secondNum = arrayTwo[pointer2];
            if(firstNum == secondNum){
                smallestDiffPair[0] = firstNum;
                smallestDiffPair[1] = secondNum;
                break;
            }
            int currDiff = Math.abs(firstNum - secondNum);
            if(currDiff < smallestDifference){
                smallestDifference = currDiff;
                smallestDiffPair[0] = firstNum;
                smallestDiffPair[1] = secondNum;
            }

            if(firstNum < secondNum){
                pointer1 ++;
            }else{ //firstNum > secondNum
                pointer2 ++;
            }
        }
        return smallestDiffPair;
    }
}




