package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that takes in an n * m two-dimensional array (that can be square-shaped when n == m)
 * and returns a one-dimensional array of all the array's elements in spiral order.
 * Spiral order starts at the top left corner of the two-dimensional array, goes to the right,
 * and proceeds in a spiral pattern all the way until every element has been visited.
 */
public class SpiralTraverse {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
                };

        List<Integer> answer =  spiralTraverse(array);
        for(int n : answer){
            System.out.print(n + " "); //print 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
        }
        System.out.println();

        int[][] array2 = {{1}};
        List<Integer> answer2 = spiralTraverse(array2);
        for(int n : answer2){
            System.out.print(n); //expect 1
        }
        System.out.println();

        int[][] array3 = {
                {1,3,2,5,4,7,6}
        };
        List<Integer> answer3 = spiralTraverse(array3);
        for(int n : answer3){
            System.out.print(n + " "); //expect 1 3 2 5 4 7 6
        }
        System.out.println();
    }

    /**
     * O(n) Time, O(n) Space where n is the total element count of the array
     * TODO: cover the edge case
     */
    public static List<Integer> spiralTraverse(int[][] array) {
        ArrayList<Integer> spiralResult = new ArrayList<>();
        int startRow = 0;
        int endRow = array.length-1;
        int startCol = 0;
        int endCol = array[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            // traverse to the 'right' until i >= endCol
            for(int i=startCol; i<=endCol; i++){
                spiralResult.add(array[startRow][i]);
            }
            startRow ++;
            //edge case
            if(startRow > endRow) break;
            // traverse to 'down' until i >= endRow
            for(int i=startRow; i<=endRow; i++){
                spiralResult.add(array[i][endCol]);
            }
            endCol--;
            if(endCol < startCol) break;
            // traverse to 'left' until i <= startCol
            for(int i=endCol; i >= startCol; i--){
                spiralResult.add(array[endRow][i]);
            }
            endRow--;
            if(endRow < startRow) break;
            // traverse to 'up' until i < startRow
            for(int i=endRow; i >= startRow; i--){
                spiralResult.add(array[i][startCol]);
            }
            startCol++;
        }
        return spiralResult;
    }
}
