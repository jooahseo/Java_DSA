package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a function that moves all instances of that integer in the array to the end of the array and returns the array
 * The function should perform this in place (i.e., it should mutate the input array)
 * and doesn't need to maintain the order of the other integer.
 */
public class MoveElementToEnd {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
        int toMove = 2;

        moveElementToEnd(array, toMove);
        for(int n : array){
            System.out.print(n + ", ");
            //expect to print 1, 3, 4, 2, 2, 2, 2, 2, -> the number 1,3,4 could be ordered differently
        }
        System.out.println();

        List<Integer> array2 = Arrays.asList(1, 2, 4, 5, 6);
        int toMove2 = 3;

        moveElementToEnd(array2, toMove2);
        for(int n : array2){
            System.out.print(n + ", ");
            //expect to print 1, 2, 4, 5, 6
        }
    }

    /**
     * O(n) Time, O(1) Space
     * TODO: FIX the index out of bound error
     */
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int left = 0;
        int right = array.size()-1;

        while(left < right){
            while(array.get(left) != toMove){
                left ++;
            }
            while(array.get(right) == toMove){
                right --;
            }
            //first check if basic condition is broken
            if(left > right) break;
            //left == toMove && right != toMove -> swap
            int temp = array.get(left);
            array.set(left, array.get(right));
            array.set(right, temp);
        }
        return array;
    }
}
