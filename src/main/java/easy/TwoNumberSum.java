package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {

    //O(n^2) time | O(1) space
    //loop through the array from i
    //inside loop, have another loop that starts from i+1
    //adding the each number and see if we get the targetSum
    //if target sum made - add those numbers into the array and return
    public static int[] twoNumberSumBruteForce(int[] array, int targetSum) {
        // Write your code here.
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] + array[j] == targetSum){
                    return new int[] {array[i], array[j]};
                }
            }
        }
        return new int[0];
    }

    //O(nlogn) Time | O(1) space
    //sort the array first
    //pointer from x (start) / pointer from y (end)
    public static int[] twoNumberSum1(int[] array, int targetSum) {
        Arrays.sort(array);
        int x = 0;
        int y = array.length -1;
        while(x < y){
            int currentSum = array[x] + array[y];
            if(currentSum == targetSum){
                return new int[] {array[x], array[y]};
            }else if(currentSum > targetSum){
                y--;
            }else{
                x++;
            }
        }
        return new int[0];
    }

    //O(n) Time | O(n) space
    //convert array into hashSet
    //iterate through the array
    //calculate difference = targetSum - array[i]
    //if target is found - return the array
    public static int[] twoNumberSum2(int[] array, int targetSum) {
        Set<Integer> set = new HashSet<>();
        for(int num: array){
            set.add(num);
        }
        for(int i=0; i<array.length; i++){
            int target = targetSum - array[i];
            if(target != array[i] && set.contains(target)){
                return new int[] {array[i], target};
            }
        }
        return new int[0];
    }
}
