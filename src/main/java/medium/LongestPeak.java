package medium;

/**
 * Write a function that takes in an array of integers and returns the length of the longest peak in the array.
 * A peak is defined as adjacent integers in the array that are 'strictly' increasing until they reach a tip (the highest value in the peak)
 * at which point they become 'strictly' decreasing. At least three integers are required to form a peak.
 * For example, the integers 1, 4, 10, 2 form a peak, but the integers 4, 0, 10 don't and neither do the integers 1, 2, 2, 0.
 * Similarly, the integers 1, 2, 3 don't form a peak because there aren't any strictly decreasing integers after the 3
 */
public class LongestPeak {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println(longestPeak(array)); //expect 6 (0, 10, 6, 5, -1, -3)
    }

    /**
     * O(n) Time, O(1) Space
     * @param array
     * @return
     */
    public static int longestPeak(int[] array) {
        int longestPeak = 0;
        //find the peak and count length from there - update the longestPeak
        for(int i=1; i<array.length-1; i++){
            //check if left < current && current > right
            int left = i - 1;
            int right = i + 1;
            int counter = 0;
            if(array[left] < array[i] && array[i] > array[right]){
                counter = 3;
                //if yes -> count all the way left until it's no longer decreasing
                while(left-1 >=0 && array[left-1] < array[left]){
                    counter ++;
                    left --;
                }
                // count all the way right until it's no longer decreasing
                while(right+1 < array.length && array[right] > array[right +1]){
                    counter ++;
                    right ++;
                }
                i = right;
                longestPeak = Math.max(counter, longestPeak);
            }
        }
        return longestPeak;
    }
}
