package medium;

/**
 * Write a function that takes in a non-empty array of integers and returns an array of the same length,
 * where each element in the output array is equal to the product of every other number in the input array.
 * In other words, the value at output[i] is equal to the product of every number in the input array other than input[i]
 * Not that you're expected to solve this problem without using division.
 */
public class ArrayOfProducts {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2};
        int[] answer = arrayOfProducts(array);
        for(int n : answer){
            System.out.print(n + " "); //expect 8 4 10 20
            // 8 = 1 x 4 x 2
            // 40 = 5 x 4 x 2
            // 10 = 5 x 1 x 2
            // 20 = 5 x 1 x 4
        }
    }

    /**
     * Brute force approach
     * O(n^2) Time, O(n) Space
     */
    public static int[] arrayOfProducts(int[] array) {
        // Write your code here.
        int[] arrayOfProduct = new int[array.length];
        for(int i=0; i<array.length; i++){
            int answer = 1;
            for(int j=0; j<array.length; j++){
                if(j == i) continue;
                answer *= array[j];
            }
            arrayOfProduct[i] = answer;
        }
        return arrayOfProduct;
    }

    /**
     * TODO: Optimized Solution
     * @param array
     * @return
     */
    public static int[] arrayOfProducts2(int[] array){
        int[] arrayOfProduct = new int[array.length];
        return arrayOfProduct;
    }
}
