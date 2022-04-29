package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
 * The function should find all triplets in the array that sum up to the target sum and return a two-dimensional array
 * of all these triplets. The numbers in each triplet should be ordered in ascending order, and the triplets themselves
 * should be ordered in ascending order with respect to the numbers they hold.
 * If no three numbers sum up to the target sum, the function should return an empty array.
 */
public class ThreeNumberSum {
    public static void main(String[] args) {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;
        List<Integer[]> answer = threeNumberSum(array, targetSum);
        System.out.println("answer length: " + answer.size());
        for(Integer[] nums : answer){
            for(int num : nums){
                System.out.println(num);
            }
            System.out.println();
        }
    }

    /**
     * O(n^2) Time, O(1) space
     */
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        ArrayList<Integer[]> answer = new ArrayList<>();
        Arrays.sort(array);
        for(int num : array){
            System.out.println(num);
        }
        for(int i=0; i<array.length; i++){
            int currentNum = array[i];
            int targetNum = targetSum - currentNum;
            int left = i+1;
            int right = array.length -1;
            while(left < right){
                int twoNumberSum = array[left] + array[right];
                if(twoNumberSum == targetNum){
                    answer.add(new Integer[]{currentNum, array[left], array[right]});
                    left ++;
                    right --;
                }else if(twoNumberSum > targetNum){
                    right --;
                }else{
                    left ++;
                }
            }
        }
        return answer;
    }
}
