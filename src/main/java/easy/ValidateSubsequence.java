package easy;

import java.util.List;

//O(n) Time | O(1) space
//loop over the sequence array
//have a pointer to check sequence for each index
//if match found, move the pointer to the right
//if pointer reaches to sequence.size() return true, otherwise false
public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int pointer = 0;
        int maxIdx = sequence.size();
        for (Integer integer : array) {
            if (integer.equals(sequence.get(pointer))) {
                pointer++;
                if (maxIdx == pointer) return true;
            }
        }
        return false;
    }

}
