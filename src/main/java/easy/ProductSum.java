package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that takes in a "special" array and returns its product sum
 * A "special" array is a non-empty array that contains either integers or other "special" arrays.
 * The product sum of a "special" array is the sum of its elements, where "special" arrays inside it
 * are summed themselves and then multiplied by their level of depth.
 * ex, the depth of [] is 1; the depth of the inner array in [[]] is 2;
 * [x, [y, z]] is x + 2 * (y + z)
 */
public class ProductSum {
    public static int productSum(List<Object> array) {
        // Write your code here.
        return productSum(array, 1);
    }

    /**
     * O(n) Time, O(d) space where n is total elements in the array and special array
     * d is the greatest depth of the "special" array
     */
    public static int productSum(List<Object> array, int depth){
        int sum = 0;
        for(Object value : array){
            if(value instanceof ArrayList){
                @SuppressWarnings("unchecked")
                ArrayList<Object> list = (ArrayList<Object>) value;
                sum += productSum(list, depth + 1);
            }else{
                sum += (int) value;
            }
        }
        return sum * depth;
    }
}
